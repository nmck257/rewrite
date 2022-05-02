/*
 * Copyright 2022 the original author or authors.
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
package org.openrewrite.cobol.internal.grammar;
// Generated from /Users/yoshi/Development/Repos/openrewrite/rewrite/rewrite-cobol/src/main/antlr/CobolParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CobolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CobolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CobolParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CobolParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#programUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramUnit(CobolParser.ProgramUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#identificationDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificationDivision(CobolParser.IdentificationDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#identificationDivisionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificationDivisionSection(CobolParser.IdentificationDivisionSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#environmentDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentDivision(CobolParser.EnvironmentDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#environmentDivisionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentDivisionSection(CobolParser.EnvironmentDivisionSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDivision(CobolParser.DataDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataDivisionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDivisionSection(CobolParser.DataDivisionSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#procedureDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivision(CobolParser.ProcedureDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#procedureDivisionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionSection(CobolParser.ProcedureDivisionSectionContext ctx);
}