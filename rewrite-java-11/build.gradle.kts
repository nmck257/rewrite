plugins {
    id("org.openrewrite.java-library")
    id("org.openrewrite.maven-publish")
}

apply(plugin = "nebula.integtest-standalone")

val integTestImplementation = configurations.getByName("integTestImplementation")

dependencies {
    api(project(":rewrite-core"))
    api(project(":rewrite-java"))

    compileOnly("org.slf4j:slf4j-api:1.7.+")

    implementation("io.micrometer:micrometer-core:1.+")
    implementation("io.github.classgraph:classgraph:latest.release")
    implementation("org.ow2.asm:asm:latest.release")

    testImplementation(project(":rewrite-test"))

    integTestImplementation("io.micrometer:micrometer-registry-prometheus:1.+")
}

tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()

    options.release.set(null as? Int) // remove `--release 8` set in `org.openrewrite.java-base`
    options.compilerArgs.addAll(
        listOf(
            "--add-exports", "jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED",
            "--add-exports", "jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED",
            "--add-exports", "jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED",
            "--add-exports", "jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED",
            "--add-exports", "jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED",
            "--add-exports", "jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED"
        )
    )
}

//Javadoc compiler will complain about the use of the internal types.
tasks.withType<Javadoc> {
    exclude(
        "**/Java11Parser**",
        "**/Java11JavadocVisitor**",
        "**/Java11TypeMapping**",
        "**/Java11TypeSignatureBuilder**"
    )
}
