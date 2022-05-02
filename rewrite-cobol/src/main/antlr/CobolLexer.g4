lexer grammar CobolLexer;

WS: [ \t\n\r\u000C]+ -> skip;

VALID_TEXT: ('a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '_' | '/' | '.' | '(' | ')' | '"')+;

COMMENT: '*'                                        -> pushMode(INSIDE_COMMENT) ;

IDENTIFICATION_DIVISION: 'IDENTIFICATION DIVISION.' -> pushMode(INSIDE_ID) ;
ENVIRONMENT_DIVISION:    'ENVIRONMENT DIVISION.'    -> pushMode(INSIDE_ED) ;
DATA_DIVISION:           'DATA DIVISION.'           -> pushMode(INSIDE_DD) ;
PROCEDURE_DIVISION:      'PROCEDURE DIVISION.'      -> pushMode(INSIDE_PD) ;

DOT: '.' ;
DOT_EOF: DOT EOF;

END_PROGRAM: E N D P R O G R A M ~[.]+ DOT_EOF;

// Characters
fragment A: 'A' | 'a';
fragment B: 'B' | 'b';
fragment C: 'C' | 'c';
fragment D: 'D' | 'd';
fragment E: 'E' | 'e';
fragment F: 'F' | 'f';
fragment G: 'G' | 'g';
fragment H: 'H' | 'h';
fragment I: 'I' | 'i';
fragment J: 'J' | 'j';
fragment K: 'K' | 'k';
fragment L: 'L' | 'l';
fragment M: 'M' | 'm';
fragment N: 'N' | 'n';
fragment O: 'O' | 'o';
fragment P: 'P' | 'p';
fragment Q: 'Q' | 'q';
fragment R: 'R' | 'r';
fragment S: 'S' | 's';
fragment T: 'T' | 't';
fragment U: 'U' | 'u';
fragment V: 'V' | 'v';
fragment W: 'W' | 'w';
fragment X: 'X' | 'x';
fragment Y: 'Y' | 'y';
fragment Z: 'Z' | 'z';

// INSIDE of Comment ------------------------------------------
mode INSIDE_COMMENT;

COMMENT_END: ('\n' | '\r') -> popMode ;

COMMENT_TEXT: ~[\n\r]+     -> skip;

// INSIDE of Identification Division ------------------------------------------
mode INSIDE_ID;

ID_WS: [ \t\n\r\u000C]+ -> skip;

ID_EOF : EOF -> popMode ;

ID_COMMENT: '*'                               -> pushMode(INSIDE_COMMENT) ;
ID_ENVIRONMENT_CLOSE: 'ENVIRONMENT DIVISION.' -> pushMode(INSIDE_ED) ;
ID_DATA_CLOSE: 'DATA DIVISION.'               -> pushMode(INSIDE_DD) ;
ID_PROCEDURE_CLOSE: 'PROCEDURE DIVISION.'     -> pushMode(INSIDE_PD) ;

ID_TEXT: VALID_TEXT;

// INSIDE of Environment Division ------------------------------------------
mode INSIDE_ED;

ED_WS: [ \t\n\r\u000C]+ -> skip;

ED_EOF : EOF -> popMode ;

ED_COMMENT: '*'                               -> pushMode(INSIDE_COMMENT) ;

ED_DATA_CLOSE: 'DATA DIVISION.'               -> pushMode(INSIDE_DD) ;
ED_PROCEDURE_CLOSE: 'PROCEDURE DIVISION.'     -> pushMode(INSIDE_PD) ;

ED_TEXT: VALID_TEXT;

// INSIDE of Data Division ------------------------------------------
mode INSIDE_DD;

DD_WS: [ \t\n\r\u000C]+ -> skip;

DD_EOF : EOF -> popMode ;

DD_COMMENT: '*'                               -> pushMode(INSIDE_COMMENT) ;

DD_PROCEDURE_CLOSE: 'PROCEDURE DIVISION.'     -> pushMode(INSIDE_PD) ;

DD_TEXT: VALID_TEXT;

// INSIDE of Procedure Division ------------------------------------------
mode INSIDE_PD;

PD_WS: [ \t\n\r\u000C]+ -> skip;

PD_EOF : '.' EOF -> popMode ;

PD_COMMENT: '*'                               -> pushMode(INSIDE_COMMENT) ;

PD_TEXT: VALID_TEXT;
