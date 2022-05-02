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
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CobolParser}.
 */
public interface CobolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CobolParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CobolParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CobolParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#programUnit}.
	 * @param ctx the parse tree
	 */
	void enterProgramUnit(CobolParser.ProgramUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#programUnit}.
	 * @param ctx the parse tree
	 */
	void exitProgramUnit(CobolParser.ProgramUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#identificationDivision}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationDivision(CobolParser.IdentificationDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#identificationDivision}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationDivision(CobolParser.IdentificationDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#identificationDivisionSection}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationDivisionSection(CobolParser.IdentificationDivisionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#identificationDivisionSection}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationDivisionSection(CobolParser.IdentificationDivisionSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#environmentDivision}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentDivision(CobolParser.EnvironmentDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#environmentDivision}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentDivision(CobolParser.EnvironmentDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#environmentDivisionSection}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentDivisionSection(CobolParser.EnvironmentDivisionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#environmentDivisionSection}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentDivisionSection(CobolParser.EnvironmentDivisionSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataDivision}.
	 * @param ctx the parse tree
	 */
	void enterDataDivision(CobolParser.DataDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataDivision}.
	 * @param ctx the parse tree
	 */
	void exitDataDivision(CobolParser.DataDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataDivisionSection}.
	 * @param ctx the parse tree
	 */
	void enterDataDivisionSection(CobolParser.DataDivisionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataDivisionSection}.
	 * @param ctx the parse tree
	 */
	void exitDataDivisionSection(CobolParser.DataDivisionSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivision(CobolParser.ProcedureDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivision(CobolParser.ProcedureDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#procedureDivisionSection}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivisionSection(CobolParser.ProcedureDivisionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#procedureDivisionSection}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivisionSection(CobolParser.ProcedureDivisionSectionContext ctx);
}