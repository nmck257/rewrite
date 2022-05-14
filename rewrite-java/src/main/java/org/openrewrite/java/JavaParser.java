/*
 * Copyright 2020 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.java;

import io.github.classgraph.ClassGraph;
import org.intellij.lang.annotations.Language;
import org.openrewrite.ExecutionContext;
import org.openrewrite.InMemoryExecutionContext;
import org.openrewrite.Parser;
import org.openrewrite.internal.lang.Nullable;
import org.openrewrite.java.internal.JavaTypeCache;
import org.openrewrite.java.marker.JavaSourceSet;
import org.openrewrite.java.tree.J;
import org.openrewrite.style.NamedStyles;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.*;

public interface JavaParser extends Parser<J.CompilationUnit> {
    /**
     * Set to <code>true</code> on an {@link ExecutionContext} supplied to parsing to skip generation of
     * type attribution from the class in {@link JavaSourceSet} marker.
     */
    String SKIP_SOURCE_SET_TYPE_GENERATION = "org.openrewrite.java.skipSourceSetTypeGeneration";

    /**
     * @deprecated Won't work in isolated classloaders.
     */
    @Deprecated
    List<Path> runtimeClasspath = Collections.unmodifiableList(Arrays.stream(System.getProperty("java.class.path").split("\\Q" + System.getProperty("path.separator") + "\\E"))
            .map(cpEntry -> new File(cpEntry).toPath())
            .collect(toList()));

    static List<Path> runtimeClasspath() {
        return new ClassGraph()
                .disableNestedJarScanning()
                .getClasspathURIs().stream()
                .map(Paths::get).collect(toList());
    }

    /**
     * Convenience utility for constructing a parser with binary dependencies on the runtime classpath of the process
     * constructing the parser.
     *
     * @param artifactNames The "artifact name" of the dependency to look for. Artifact name is the artifact portion of
     *                      group:artifact:version coordinates. For example, for Google's Guava (com.google.guava:guava:VERSION),
     *                      the artifact name is "guava".
     * @return A set of paths of jars on the runtime classpath matching the provided artifact names, to the extent such
     * matching jars can be found.
     */
    static List<Path> dependenciesFromClasspath(String... artifactNames) {
        Map<String, Pattern> artifactNamePatterns = Arrays.stream(artifactNames)
                .collect(toMap(Function.identity(), name -> Pattern.compile(name + "-.*?\\.jar$")));

        Set<String> foundArtifacts = new HashSet<>();
        List<Path> artifacts = new ArrayList<>();
        List<URI> runtimeClasspath = new ClassGraph().getClasspathURIs();
        for (URI cpEntry : runtimeClasspath) {
            for (Map.Entry<String, Pattern> artifactNamePattern : artifactNamePatterns.entrySet()) {
                if (artifactNamePattern.getValue().matcher(cpEntry.toString()).find()) {
                    artifacts.add(Paths.get(cpEntry));
                    foundArtifacts.add(artifactNamePattern.getKey());
                }
            }
        }

        for (String foundArtifact : foundArtifacts) {
            artifactNamePatterns.remove(foundArtifact);
        }

        if (!artifactNamePatterns.isEmpty()) {
            throw new IllegalArgumentException("Unable to find runtime dependencies beginning with: " +
                    artifactNamePatterns.keySet().stream().map(a -> "'" + a + "'").sorted().collect(joining(", ")));
        }

        return artifacts;
    }

    /**
     * Builds a Java parser with a language level equal to that of the JDK running this JVM process.
     */
    static JavaParser.Builder<? extends JavaParser, ?> fromJavaVersion() {
        JavaParser.Builder<? extends JavaParser, ?> javaParser;
        String version = System.getProperty("java.version");
        try {
            if (version.startsWith("1.8")) {
                javaParser = (JavaParser.Builder<? extends JavaParser, ?>) Class
                        .forName("org.openrewrite.java.Java8Parser")
                        .getDeclaredMethod("builder")
                        .invoke(null);
            } else if (version.startsWith("11")) {
                javaParser = (JavaParser.Builder<? extends JavaParser, ?>) Class
                        .forName("org.openrewrite.java.Java11Parser")
                        .getDeclaredMethod("builder")
                        .invoke(null);
            } else {
                javaParser = (JavaParser.Builder<? extends JavaParser, ?>) Class
                        .forName("org.openrewrite.java.Java17Parser")
                        .getDeclaredMethod("builder")
                        .invoke(null);
            }
        } catch (Exception e) {
            throw new IllegalStateException("Unable to create a Java parser instance. " +
                    "`rewrite-java-8`, `rewrite-java-11`, or `rewrite-java-17` must be on the classpath.", e);
        }

        return javaParser;
    }

    @Override
    default List<J.CompilationUnit> parse(ExecutionContext ctx, @Language("java") String... sources) {
        return parseInputs(
                Arrays.stream(sources)
                        .map(sourceFile -> new Input(
                                sourcePathFromSourceText(Paths.get(""), sourceFile),
                                () -> new ByteArrayInputStream(sourceFile.getBytes(StandardCharsets.UTF_8))
                        ))
                        .collect(toList()),
                null,
                ctx
        );
    }

    @Override
    default List<J.CompilationUnit> parse(@Language("java") String... sources) {
        InMemoryExecutionContext ctx = new InMemoryExecutionContext();
        return parse(ctx, sources);
    }

    @Override
    default boolean accept(Path path) {
        return path.toString().endsWith(".java");
    }

    /**
     * Clear any in-memory parser caches that may prevent re-parsing of classes with the same fully qualified name in
     * different rounds
     */
    JavaParser reset();

    /**
     * Changes the classpath on the parser. Intended for use in multiple pass parsing, where we want to keep the
     * compiler symbol table intact for type attribution on later parses, i.e. for maven multi-module projects.
     *
     * @param classpath new classpath to use
     */
    void setClasspath(Collection<Path> classpath);

    /**
     * Changes the source set on the parser. Intended for use in multiple pass parsing, where we want to keep the
     * compiler symbol table intact for type attribution on later parses, i.e. for maven multi-module projects.
     *
     * @param sourceSet source set used to set {@link org.openrewrite.java.marker.JavaSourceSet} markers on
     *                  subsequently parsed {@link J.CompilationUnit}
     */
    void setSourceSet(String sourceSet);

    JavaSourceSet getSourceSet(ExecutionContext ctx);

    @SuppressWarnings("unchecked")
    abstract class Builder<P extends JavaParser, B extends Builder<P, B>> {
        protected Collection<Path> classpath = Collections.emptyList();
        protected Collection<byte[]> classBytesClasspath = Collections.emptyList();
        protected JavaTypeCache javaTypeCache = new JavaTypeCache();

        @Nullable
        protected Collection<Input> dependsOn;

        protected Charset charset = Charset.defaultCharset();
        protected boolean logCompilationWarningsAndErrors = false;
        protected final List<NamedStyles> styles = new ArrayList<>();

        public B logCompilationWarningsAndErrors(boolean logCompilationWarningsAndErrors) {
            this.logCompilationWarningsAndErrors = logCompilationWarningsAndErrors;
            return (B) this;
        }

        public B typeCache(JavaTypeCache javaTypeCache) {
            this.javaTypeCache = javaTypeCache;
            return (B) this;
        }

        public B charset(Charset charset) {
            this.charset = charset;
            return (B) this;
        }

        public B dependsOn(Collection<Input> inputs) {
            this.dependsOn = inputs;
            return (B) this;
        }

        public B dependsOn(@Language("java") String... inputsAsStrings) {
            this.dependsOn = Arrays.stream(inputsAsStrings)
                    .map(Input::fromString)
                    .collect(toList());
            return (B) this;
        }

        public B classpath(Collection<Path> classpath) {
            this.classpath = classpath;
            return (B) this;
        }

        public B classpath(String... classpath) {
            this.classpath = dependenciesFromClasspath(classpath);
            return (B) this;
        }

        public B classpath(byte[]... classpath) {
            this.classBytesClasspath = Arrays.asList(classpath);
            return (B) this;
        }

        public B styles(Iterable<? extends NamedStyles> styles) {
            for (NamedStyles style : styles) {
                this.styles.add(style);
            }
            return (B) this;
        }

        public abstract P build();
    }

    @Override
    default Path sourcePathFromSourceText(Path prefix, String sourceCode) {
        Pattern packagePattern = Pattern.compile("^package\\s+([^;]+);");
        Pattern classPattern = Pattern.compile("(class|interface|enum)\\s*(<[^>]*>)?\\s+(\\w+)");

        Function<String, String> simpleName = sourceStr -> {
            Matcher classMatcher = classPattern.matcher(sourceStr);
            return classMatcher.find() ? classMatcher.group(3) : null;
        };

        Matcher packageMatcher = packagePattern.matcher(sourceCode);
        String pkg = packageMatcher.find() ? packageMatcher.group(1).replace('.', '/') + "/" : "";

        String className = Optional.ofNullable(simpleName.apply(sourceCode))
                .orElse(Long.toString(System.nanoTime())) + ".java";

        return prefix.resolve(Paths.get(pkg + className));
    }
}
