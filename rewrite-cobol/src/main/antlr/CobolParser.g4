parser grammar CobolParser;

options { tokenVocab=CobolLexer; }

compilationUnit
    : programUnit+
    ;

programUnit
    : identificationDivision environmentDivision? dataDivision? procedureDivision? END_PROGRAM?
    ;

identificationDivision
    : (COMMENT COMMENT_END)* IDENTIFICATION_DIVISION identificationDivisionSection* ID_EOF?
    ;

identificationDivisionSection
    : ID_TEXT
    | (ID_COMMENT COMMENT_END)
    ;

environmentDivision
    : (COMMENT COMMENT_END)* (ENVIRONMENT_DIVISION | ID_ENVIRONMENT_CLOSE) environmentDivisionSection* ED_EOF?
    ;

environmentDivisionSection
    : ED_TEXT
    | ED_COMMENT COMMENT_END
    ;

dataDivision
    : (COMMENT COMMENT_END)* (DATA_DIVISION | ID_DATA_CLOSE | ED_DATA_CLOSE) dataDivisionSection* DD_EOF?
    ;

dataDivisionSection
    : DD_TEXT
    | DD_COMMENT COMMENT_END
    ;

procedureDivision
    : (COMMENT COMMENT_END)* (PROCEDURE_DIVISION | DD_PROCEDURE_CLOSE) procedureDivisionSection* PD_EOF?
    ;

procedureDivisionSection
    : PD_TEXT
    | PD_COMMENT COMMENT_END
    ;