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
// Generated from /Users/yoshi/Development/Repos/openrewrite/rewrite/rewrite-cobol/src/main/antlr/CobolLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CobolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, VALID_TEXT=2, COMMENT=3, IDENTIFICATION_DIVISION=4, ENVIRONMENT_DIVISION=5, 
		DATA_DIVISION=6, PROCEDURE_DIVISION=7, DOT=8, DOT_EOF=9, END_PROGRAM=10, 
		COMMENT_END=11, COMMENT_TEXT=12, ID_WS=13, ID_EOF=14, ID_COMMENT=15, ID_ENVIRONMENT_CLOSE=16, 
		ID_DATA_CLOSE=17, ID_PROCEDURE_CLOSE=18, ID_TEXT=19, ED_WS=20, ED_EOF=21, 
		ED_COMMENT=22, ED_DATA_CLOSE=23, ED_PROCEDURE_CLOSE=24, ED_TEXT=25, DD_WS=26, 
		DD_EOF=27, DD_COMMENT=28, DD_PROCEDURE_CLOSE=29, DD_TEXT=30, PD_WS=31, 
		PD_EOF=32, PD_COMMENT=33, PD_TEXT=34;
	public static final int
		INSIDE_COMMENT=1, INSIDE_ID=2, INSIDE_ED=3, INSIDE_DD=4, INSIDE_PD=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_COMMENT", "INSIDE_ID", "INSIDE_ED", "INSIDE_DD", 
		"INSIDE_PD"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "VALID_TEXT", "COMMENT", "IDENTIFICATION_DIVISION", "ENVIRONMENT_DIVISION", 
			"DATA_DIVISION", "PROCEDURE_DIVISION", "DOT", "DOT_EOF", "END_PROGRAM", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "COMMENT_END", 
			"COMMENT_TEXT", "ID_WS", "ID_EOF", "ID_COMMENT", "ID_ENVIRONMENT_CLOSE", 
			"ID_DATA_CLOSE", "ID_PROCEDURE_CLOSE", "ID_TEXT", "ED_WS", "ED_EOF", 
			"ED_COMMENT", "ED_DATA_CLOSE", "ED_PROCEDURE_CLOSE", "ED_TEXT", "DD_WS", 
			"DD_EOF", "DD_COMMENT", "DD_PROCEDURE_CLOSE", "DD_TEXT", "PD_WS", "PD_EOF", 
			"PD_COMMENT", "PD_TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'IDENTIFICATION DIVISION.'", null, null, null, 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "VALID_TEXT", "COMMENT", "IDENTIFICATION_DIVISION", "ENVIRONMENT_DIVISION", 
			"DATA_DIVISION", "PROCEDURE_DIVISION", "DOT", "DOT_EOF", "END_PROGRAM", 
			"COMMENT_END", "COMMENT_TEXT", "ID_WS", "ID_EOF", "ID_COMMENT", "ID_ENVIRONMENT_CLOSE", 
			"ID_DATA_CLOSE", "ID_PROCEDURE_CLOSE", "ID_TEXT", "ED_WS", "ED_EOF", 
			"ED_COMMENT", "ED_DATA_CLOSE", "ED_PROCEDURE_CLOSE", "ED_TEXT", "DD_WS", 
			"DD_EOF", "DD_COMMENT", "DD_PROCEDURE_CLOSE", "DD_TEXT", "PD_WS", "PD_EOF", 
			"PD_COMMENT", "PD_TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CobolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CobolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0200\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t"+
		"\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t"+
		":\4;\t;\4<\t<\4=\t=\3\2\6\2\u0082\n\2\r\2\16\2\u0083\3\2\3\2\3\3\6\3\u0089"+
		"\n\3\r\3\16\3\u008a\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00fb\n\13\r\13"+
		"\16\13\u00fc\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3\'\6\'\u013a"+
		"\n\'\r\'\16\'\u013b\3\'\3\'\3(\6(\u0141\n(\r(\16(\u0142\3(\3(\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3/\6/\u0191\n/\r/\16/\u0192\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\65\6\65\u01c9\n\65\r\65\16\65\u01ca\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\39\39\3:\6:\u01f0\n:\r:\16:\u01f1\3:\3:\3;\3;\3;\3;\3"+
		";\3<\3<\3<\3<\3=\3=\2\2>\b\3\n\4\f\5\16\6\20\7\22\b\24\t\26\n\30\13\32"+
		"\f\34\2\36\2 \2\"\2$\2&\2(\2*\2,\2.\2\60\2\62\2\64\2\66\28\2:\2<\2>\2"+
		"@\2B\2D\2F\2H\2J\2L\2N\2P\rR\16T\17V\20X\21Z\22\\\23^\24`\25b\26d\27f"+
		"\30h\31j\32l\33n\34p\35r\36t\37v x!z\"|#~$\b\2\3\4\5\6\7 \5\2\13\f\16"+
		"\17\"\"\b\2$$*+/;C\\aac|\3\2\60\60\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXx"+
		"x\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2\f\f\17\17\2\u01e8\2\b\3\2\2\2"+
		"\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3"+
		"\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\3P\3\2\2\2\3R\3\2\2\2\4"+
		"T\3\2\2\2\4V\3\2\2\2\4X\3\2\2\2\4Z\3\2\2\2\4\\\3\2\2\2\4^\3\2\2\2\4`\3"+
		"\2\2\2\5b\3\2\2\2\5d\3\2\2\2\5f\3\2\2\2\5h\3\2\2\2\5j\3\2\2\2\5l\3\2\2"+
		"\2\6n\3\2\2\2\6p\3\2\2\2\6r\3\2\2\2\6t\3\2\2\2\6v\3\2\2\2\7x\3\2\2\2\7"+
		"z\3\2\2\2\7|\3\2\2\2\7~\3\2\2\2\b\u0081\3\2\2\2\n\u0088\3\2\2\2\f\u008c"+
		"\3\2\2\2\16\u0090\3\2\2\2\20\u00ab\3\2\2\2\22\u00c3\3\2\2\2\24\u00d4\3"+
		"\2\2\2\26\u00ea\3\2\2\2\30\u00ec\3\2\2\2\32\u00ef\3\2\2\2\34\u0100\3\2"+
		"\2\2\36\u0102\3\2\2\2 \u0104\3\2\2\2\"\u0106\3\2\2\2$\u0108\3\2\2\2&\u010a"+
		"\3\2\2\2(\u010c\3\2\2\2*\u010e\3\2\2\2,\u0110\3\2\2\2.\u0112\3\2\2\2\60"+
		"\u0114\3\2\2\2\62\u0116\3\2\2\2\64\u0118\3\2\2\2\66\u011a\3\2\2\28\u011c"+
		"\3\2\2\2:\u011e\3\2\2\2<\u0120\3\2\2\2>\u0122\3\2\2\2@\u0124\3\2\2\2B"+
		"\u0126\3\2\2\2D\u0128\3\2\2\2F\u012a\3\2\2\2H\u012c\3\2\2\2J\u012e\3\2"+
		"\2\2L\u0130\3\2\2\2N\u0132\3\2\2\2P\u0134\3\2\2\2R\u0139\3\2\2\2T\u0140"+
		"\3\2\2\2V\u0146\3\2\2\2X\u014a\3\2\2\2Z\u014e\3\2\2\2\\\u0166\3\2\2\2"+
		"^\u0177\3\2\2\2`\u018d\3\2\2\2b\u0190\3\2\2\2d\u0196\3\2\2\2f\u019a\3"+
		"\2\2\2h\u019e\3\2\2\2j\u01af\3\2\2\2l\u01c5\3\2\2\2n\u01c8\3\2\2\2p\u01ce"+
		"\3\2\2\2r\u01d2\3\2\2\2t\u01d6\3\2\2\2v\u01ec\3\2\2\2x\u01ef\3\2\2\2z"+
		"\u01f5\3\2\2\2|\u01fa\3\2\2\2~\u01fe\3\2\2\2\u0080\u0082\t\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\2\2\2\u0086\t\3\2\2\2\u0087\u0089"+
		"\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\13\3\2\2\2\u008c\u008d\7,\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u008f\b\4\3\2\u008f\r\3\2\2\2\u0090\u0091\7K\2\2\u0091\u0092\7"+
		"F\2\2\u0092\u0093\7G\2\2\u0093\u0094\7P\2\2\u0094\u0095\7V\2\2\u0095\u0096"+
		"\7K\2\2\u0096\u0097\7H\2\2\u0097\u0098\7K\2\2\u0098\u0099\7E\2\2\u0099"+
		"\u009a\7C\2\2\u009a\u009b\7V\2\2\u009b\u009c\7K\2\2\u009c\u009d\7Q\2\2"+
		"\u009d\u009e\7P\2\2\u009e\u009f\7\"\2\2\u009f\u00a0\7F\2\2\u00a0\u00a1"+
		"\7K\2\2\u00a1\u00a2\7X\2\2\u00a2\u00a3\7K\2\2\u00a3\u00a4\7U\2\2\u00a4"+
		"\u00a5\7K\2\2\u00a5\u00a6\7Q\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8\7\60\2"+
		"\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\5\4\2\u00aa\17\3\2\2\2\u00ab\u00ac"+
		"\7G\2\2\u00ac\u00ad\7P\2\2\u00ad\u00ae\7X\2\2\u00ae\u00af\7K\2\2\u00af"+
		"\u00b0\7T\2\2\u00b0\u00b1\7Q\2\2\u00b1\u00b2\7P\2\2\u00b2\u00b3\7O\2\2"+
		"\u00b3\u00b4\7G\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6\7V\2\2\u00b6\u00b7"+
		"\7\"\2\2\u00b7\u00b8\7F\2\2\u00b8\u00b9\7K\2\2\u00b9\u00ba\7X\2\2\u00ba"+
		"\u00bb\7K\2\2\u00bb\u00bc\7U\2\2\u00bc\u00bd\7K\2\2\u00bd\u00be\7Q\2\2"+
		"\u00be\u00bf\7P\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\b\6\5\2\u00c2\21\3\2\2\2\u00c3\u00c4\7F\2\2\u00c4\u00c5\7C\2\2\u00c5"+
		"\u00c6\7V\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\7F\2"+
		"\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7X\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd"+
		"\7U\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7Q\2\2\u00cf\u00d0\7P\2\2\u00d0"+
		"\u00d1\7\60\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\7\6\2\u00d3\23\3\2\2"+
		"\2\u00d4\u00d5\7R\2\2\u00d5\u00d6\7T\2\2\u00d6\u00d7\7Q\2\2\u00d7\u00d8"+
		"\7E\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da\7F\2\2\u00da\u00db\7W\2\2\u00db"+
		"\u00dc\7T\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7F\2"+
		"\2\u00df\u00e0\7K\2\2\u00e0\u00e1\7X\2\2\u00e1\u00e2\7K\2\2\u00e2\u00e3"+
		"\7U\2\2\u00e3\u00e4\7K\2\2\u00e4\u00e5\7Q\2\2\u00e5\u00e6\7P\2\2\u00e6"+
		"\u00e7\7\60\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\b\7\2\u00e9\25\3\2\2"+
		"\2\u00ea\u00eb\7\60\2\2\u00eb\27\3\2\2\2\u00ec\u00ed\5\26\t\2\u00ed\u00ee"+
		"\7\2\2\3\u00ee\31\3\2\2\2\u00ef\u00f0\5$\20\2\u00f0\u00f1\5\66\31\2\u00f1"+
		"\u00f2\5\"\17\2\u00f2\u00f3\5:\33\2\u00f3\u00f4\5>\35\2\u00f4\u00f5\5"+
		"8\32\2\u00f5\u00f6\5(\22\2\u00f6\u00f7\5>\35\2\u00f7\u00f8\5\34\f\2\u00f8"+
		"\u00fa\5\64\30\2\u00f9\u00fb\n\4\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\5\30\n\2\u00ff\33\3\2\2\2\u0100\u0101\t\5\2\2\u0101\35\3\2\2\2"+
		"\u0102\u0103\t\6\2\2\u0103\37\3\2\2\2\u0104\u0105\t\7\2\2\u0105!\3\2\2"+
		"\2\u0106\u0107\t\b\2\2\u0107#\3\2\2\2\u0108\u0109\t\t\2\2\u0109%\3\2\2"+
		"\2\u010a\u010b\t\n\2\2\u010b\'\3\2\2\2\u010c\u010d\t\13\2\2\u010d)\3\2"+
		"\2\2\u010e\u010f\t\f\2\2\u010f+\3\2\2\2\u0110\u0111\t\r\2\2\u0111-\3\2"+
		"\2\2\u0112\u0113\t\16\2\2\u0113/\3\2\2\2\u0114\u0115\t\17\2\2\u0115\61"+
		"\3\2\2\2\u0116\u0117\t\20\2\2\u0117\63\3\2\2\2\u0118\u0119\t\21\2\2\u0119"+
		"\65\3\2\2\2\u011a\u011b\t\22\2\2\u011b\67\3\2\2\2\u011c\u011d\t\23\2\2"+
		"\u011d9\3\2\2\2\u011e\u011f\t\24\2\2\u011f;\3\2\2\2\u0120\u0121\t\25\2"+
		"\2\u0121=\3\2\2\2\u0122\u0123\t\26\2\2\u0123?\3\2\2\2\u0124\u0125\t\27"+
		"\2\2\u0125A\3\2\2\2\u0126\u0127\t\30\2\2\u0127C\3\2\2\2\u0128\u0129\t"+
		"\31\2\2\u0129E\3\2\2\2\u012a\u012b\t\32\2\2\u012bG\3\2\2\2\u012c\u012d"+
		"\t\33\2\2\u012dI\3\2\2\2\u012e\u012f\t\34\2\2\u012fK\3\2\2\2\u0130\u0131"+
		"\t\35\2\2\u0131M\3\2\2\2\u0132\u0133\t\36\2\2\u0133O\3\2\2\2\u0134\u0135"+
		"\t\37\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b&\b\2\u0137Q\3\2\2\2\u0138"+
		"\u013a\n\37\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b\'\2\2\u013e"+
		"S\3\2\2\2\u013f\u0141\t\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145"+
		"\b(\2\2\u0145U\3\2\2\2\u0146\u0147\7\2\2\3\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\b)\b\2\u0149W\3\2\2\2\u014a\u014b\7,\2\2\u014b\u014c\3\2\2\2\u014c\u014d"+
		"\b*\3\2\u014dY\3\2\2\2\u014e\u014f\7G\2\2\u014f\u0150\7P\2\2\u0150\u0151"+
		"\7X\2\2\u0151\u0152\7K\2\2\u0152\u0153\7T\2\2\u0153\u0154\7Q\2\2\u0154"+
		"\u0155\7P\2\2\u0155\u0156\7O\2\2\u0156\u0157\7G\2\2\u0157\u0158\7P\2\2"+
		"\u0158\u0159\7V\2\2\u0159\u015a\7\"\2\2\u015a\u015b\7F\2\2\u015b\u015c"+
		"\7K\2\2\u015c\u015d\7X\2\2\u015d\u015e\7K\2\2\u015e\u015f\7U\2\2\u015f"+
		"\u0160\7K\2\2\u0160\u0161\7Q\2\2\u0161\u0162\7P\2\2\u0162\u0163\7\60\2"+
		"\2\u0163\u0164\3\2\2\2\u0164\u0165\b+\5\2\u0165[\3\2\2\2\u0166\u0167\7"+
		"F\2\2\u0167\u0168\7C\2\2\u0168\u0169\7V\2\2\u0169\u016a\7C\2\2\u016a\u016b"+
		"\7\"\2\2\u016b\u016c\7F\2\2\u016c\u016d\7K\2\2\u016d\u016e\7X\2\2\u016e"+
		"\u016f\7K\2\2\u016f\u0170\7U\2\2\u0170\u0171\7K\2\2\u0171\u0172\7Q\2\2"+
		"\u0172\u0173\7P\2\2\u0173\u0174\7\60\2\2\u0174\u0175\3\2\2\2\u0175\u0176"+
		"\b,\6\2\u0176]\3\2\2\2\u0177\u0178\7R\2\2\u0178\u0179\7T\2\2\u0179\u017a"+
		"\7Q\2\2\u017a\u017b\7E\2\2\u017b\u017c\7G\2\2\u017c\u017d\7F\2\2\u017d"+
		"\u017e\7W\2\2\u017e\u017f\7T\2\2\u017f\u0180\7G\2\2\u0180\u0181\7\"\2"+
		"\2\u0181\u0182\7F\2\2\u0182\u0183\7K\2\2\u0183\u0184\7X\2\2\u0184\u0185"+
		"\7K\2\2\u0185\u0186\7U\2\2\u0186\u0187\7K\2\2\u0187\u0188\7Q\2\2\u0188"+
		"\u0189\7P\2\2\u0189\u018a\7\60\2\2\u018a\u018b\3\2\2\2\u018b\u018c\b-"+
		"\7\2\u018c_\3\2\2\2\u018d\u018e\5\n\3\2\u018ea\3\2\2\2\u018f\u0191\t\2"+
		"\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\b/\2\2\u0195c\3\2\2\2\u0196"+
		"\u0197\7\2\2\3\u0197\u0198\3\2\2\2\u0198\u0199\b\60\b\2\u0199e\3\2\2\2"+
		"\u019a\u019b\7,\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b\61\3\2\u019dg\3"+
		"\2\2\2\u019e\u019f\7F\2\2\u019f\u01a0\7C\2\2\u01a0\u01a1\7V\2\2\u01a1"+
		"\u01a2\7C\2\2\u01a2\u01a3\7\"\2\2\u01a3\u01a4\7F\2\2\u01a4\u01a5\7K\2"+
		"\2\u01a5\u01a6\7X\2\2\u01a6\u01a7\7K\2\2\u01a7\u01a8\7U\2\2\u01a8\u01a9"+
		"\7K\2\2\u01a9\u01aa\7Q\2\2\u01aa\u01ab\7P\2\2\u01ab\u01ac\7\60\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\b\62\6\2\u01aei\3\2\2\2\u01af\u01b0\7R\2\2"+
		"\u01b0\u01b1\7T\2\2\u01b1\u01b2\7Q\2\2\u01b2\u01b3\7E\2\2\u01b3\u01b4"+
		"\7G\2\2\u01b4\u01b5\7F\2\2\u01b5\u01b6\7W\2\2\u01b6\u01b7\7T\2\2\u01b7"+
		"\u01b8\7G\2\2\u01b8\u01b9\7\"\2\2\u01b9\u01ba\7F\2\2\u01ba\u01bb\7K\2"+
		"\2\u01bb\u01bc\7X\2\2\u01bc\u01bd\7K\2\2\u01bd\u01be\7U\2\2\u01be\u01bf"+
		"\7K\2\2\u01bf\u01c0\7Q\2\2\u01c0\u01c1\7P\2\2\u01c1\u01c2\7\60\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\b\63\7\2\u01c4k\3\2\2\2\u01c5\u01c6\5\n\3\2"+
		"\u01c6m\3\2\2\2\u01c7\u01c9\t\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3"+
		"\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\b\65\2\2\u01cdo\3\2\2\2\u01ce\u01cf\7\2\2\3\u01cf\u01d0\3\2\2\2"+
		"\u01d0\u01d1\b\66\b\2\u01d1q\3\2\2\2\u01d2\u01d3\7,\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d4\u01d5\b\67\3\2\u01d5s\3\2\2\2\u01d6\u01d7\7R\2\2\u01d7\u01d8"+
		"\7T\2\2\u01d8\u01d9\7Q\2\2\u01d9\u01da\7E\2\2\u01da\u01db\7G\2\2\u01db"+
		"\u01dc\7F\2\2\u01dc\u01dd\7W\2\2\u01dd\u01de\7T\2\2\u01de\u01df\7G\2\2"+
		"\u01df\u01e0\7\"\2\2\u01e0\u01e1\7F\2\2\u01e1\u01e2\7K\2\2\u01e2\u01e3"+
		"\7X\2\2\u01e3\u01e4\7K\2\2\u01e4\u01e5\7U\2\2\u01e5\u01e6\7K\2\2\u01e6"+
		"\u01e7\7Q\2\2\u01e7\u01e8\7P\2\2\u01e8\u01e9\7\60\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\b8\7\2\u01ebu\3\2\2\2\u01ec\u01ed\5\n\3\2\u01edw\3\2"+
		"\2\2\u01ee\u01f0\t\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\b:"+
		"\2\2\u01f4y\3\2\2\2\u01f5\u01f6\7\60\2\2\u01f6\u01f7\7\2\2\3\u01f7\u01f8"+
		"\3\2\2\2\u01f8\u01f9\b;\b\2\u01f9{\3\2\2\2\u01fa\u01fb\7,\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\b<\3\2\u01fd}\3\2\2\2\u01fe\u01ff\5\n\3\2\u01ff\177"+
		"\3\2\2\2\20\2\3\4\5\6\7\u0083\u008a\u00fc\u013b\u0142\u0192\u01ca\u01f1"+
		"\t\b\2\2\7\3\2\7\4\2\7\5\2\7\6\2\7\7\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}