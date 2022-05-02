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
package org.openrewrite.cobol.internal;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.openrewrite.cobol.internal.grammar.CobolParser;
import org.openrewrite.cobol.internal.grammar.CobolParserBaseVisitor;
import org.openrewrite.cobol.tree.Cobol;

public class CobolParserVisitor extends CobolParserBaseVisitor<Cobol> {

    @Override
    public Cobol visitCompilationUnit(CobolParser.CompilationUnitContext ctx) {
        return super.visitCompilationUnit(ctx);
    }

    @Override
    public Cobol visitProgramUnit(CobolParser.ProgramUnitContext ctx) {
        return super.visitProgramUnit(ctx);
    }

    @Override
    public Cobol visitIdentificationDivision(CobolParser.IdentificationDivisionContext ctx) {
        return super.visitIdentificationDivision(ctx);
    }

    @Override
    public Cobol visitIdentificationDivisionSection(CobolParser.IdentificationDivisionSectionContext ctx) {
        return super.visitIdentificationDivisionSection(ctx);
    }

    @Override
    public Cobol visitDataDivision(CobolParser.DataDivisionContext ctx) {
        return super.visitDataDivision(ctx);
    }

    @Override
    public Cobol visitDataDivisionSection(CobolParser.DataDivisionSectionContext ctx) {
        return super.visitDataDivisionSection(ctx);
    }

    @Override
    public Cobol visitEnvironmentDivision(CobolParser.EnvironmentDivisionContext ctx) {
        return super.visitEnvironmentDivision(ctx);
    }

    @Override
    public Cobol visitEnvironmentDivisionSection(CobolParser.EnvironmentDivisionSectionContext ctx) {
        return super.visitEnvironmentDivisionSection(ctx);
    }

    @Override
    public Cobol visitProcedureDivision(CobolParser.ProcedureDivisionContext ctx) {
        return super.visitProcedureDivision(ctx);
    }

    @Override
    public Cobol visitProcedureDivisionSection(CobolParser.ProcedureDivisionSectionContext ctx) {
        return super.visitProcedureDivisionSection(ctx);
    }

    @Override
    public Cobol visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }
}
