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
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CobolParser extends Parser {
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
		RULE_compilationUnit = 0, RULE_programUnit = 1, RULE_identificationDivision = 2, 
		RULE_identificationDivisionSection = 3, RULE_environmentDivision = 4, 
		RULE_environmentDivisionSection = 5, RULE_dataDivision = 6, RULE_dataDivisionSection = 7, 
		RULE_procedureDivision = 8, RULE_procedureDivisionSection = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "programUnit", "identificationDivision", "identificationDivisionSection", 
			"environmentDivision", "environmentDivisionSection", "dataDivision", 
			"dataDivisionSection", "procedureDivision", "procedureDivisionSection"
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

	@Override
	public String getGrammarFileName() { return "CobolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CobolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ProgramUnitContext> programUnit() {
			return getRuleContexts(ProgramUnitContext.class);
		}
		public ProgramUnitContext programUnit(int i) {
			return getRuleContext(ProgramUnitContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				programUnit();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMENT || _la==IDENTIFICATION_DIVISION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramUnitContext extends ParserRuleContext {
		public IdentificationDivisionContext identificationDivision() {
			return getRuleContext(IdentificationDivisionContext.class,0);
		}
		public EnvironmentDivisionContext environmentDivision() {
			return getRuleContext(EnvironmentDivisionContext.class,0);
		}
		public DataDivisionContext dataDivision() {
			return getRuleContext(DataDivisionContext.class,0);
		}
		public ProcedureDivisionContext procedureDivision() {
			return getRuleContext(ProcedureDivisionContext.class,0);
		}
		public TerminalNode END_PROGRAM() { return getToken(CobolParser.END_PROGRAM, 0); }
		public ProgramUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterProgramUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitProgramUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitProgramUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramUnitContext programUnit() throws RecognitionException {
		ProgramUnitContext _localctx = new ProgramUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			identificationDivision();
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(26);
				environmentDivision();
				}
				break;
			}
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(29);
				dataDivision();
				}
				break;
			}
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(32);
				procedureDivision();
				}
				break;
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_PROGRAM) {
				{
				setState(35);
				match(END_PROGRAM);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificationDivisionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_DIVISION() { return getToken(CobolParser.IDENTIFICATION_DIVISION, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(CobolParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CobolParser.COMMENT, i);
		}
		public List<TerminalNode> COMMENT_END() { return getTokens(CobolParser.COMMENT_END); }
		public TerminalNode COMMENT_END(int i) {
			return getToken(CobolParser.COMMENT_END, i);
		}
		public List<IdentificationDivisionSectionContext> identificationDivisionSection() {
			return getRuleContexts(IdentificationDivisionSectionContext.class);
		}
		public IdentificationDivisionSectionContext identificationDivisionSection(int i) {
			return getRuleContext(IdentificationDivisionSectionContext.class,i);
		}
		public TerminalNode ID_EOF() { return getToken(CobolParser.ID_EOF, 0); }
		public IdentificationDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificationDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterIdentificationDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitIdentificationDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitIdentificationDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificationDivisionContext identificationDivision() throws RecognitionException {
		IdentificationDivisionContext _localctx = new IdentificationDivisionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identificationDivision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(38);
				match(COMMENT);
				setState(39);
				match(COMMENT_END);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(IDENTIFICATION_DIVISION);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID_COMMENT || _la==ID_TEXT) {
				{
				{
				setState(46);
				identificationDivisionSection();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_EOF) {
				{
				setState(52);
				match(ID_EOF);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificationDivisionSectionContext extends ParserRuleContext {
		public TerminalNode ID_TEXT() { return getToken(CobolParser.ID_TEXT, 0); }
		public TerminalNode ID_COMMENT() { return getToken(CobolParser.ID_COMMENT, 0); }
		public TerminalNode COMMENT_END() { return getToken(CobolParser.COMMENT_END, 0); }
		public IdentificationDivisionSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificationDivisionSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterIdentificationDivisionSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitIdentificationDivisionSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitIdentificationDivisionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificationDivisionSectionContext identificationDivisionSection() throws RecognitionException {
		IdentificationDivisionSectionContext _localctx = new IdentificationDivisionSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identificationDivisionSection);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(ID_TEXT);
				}
				break;
			case ID_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(56);
				match(ID_COMMENT);
				setState(57);
				match(COMMENT_END);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentDivisionContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT_DIVISION() { return getToken(CobolParser.ENVIRONMENT_DIVISION, 0); }
		public TerminalNode ID_ENVIRONMENT_CLOSE() { return getToken(CobolParser.ID_ENVIRONMENT_CLOSE, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(CobolParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CobolParser.COMMENT, i);
		}
		public List<TerminalNode> COMMENT_END() { return getTokens(CobolParser.COMMENT_END); }
		public TerminalNode COMMENT_END(int i) {
			return getToken(CobolParser.COMMENT_END, i);
		}
		public List<EnvironmentDivisionSectionContext> environmentDivisionSection() {
			return getRuleContexts(EnvironmentDivisionSectionContext.class);
		}
		public EnvironmentDivisionSectionContext environmentDivisionSection(int i) {
			return getRuleContext(EnvironmentDivisionSectionContext.class,i);
		}
		public TerminalNode ED_EOF() { return getToken(CobolParser.ED_EOF, 0); }
		public EnvironmentDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterEnvironmentDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitEnvironmentDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitEnvironmentDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironmentDivisionContext environmentDivision() throws RecognitionException {
		EnvironmentDivisionContext _localctx = new EnvironmentDivisionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_environmentDivision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(60);
				match(COMMENT);
				setState(61);
				match(COMMENT_END);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==ENVIRONMENT_DIVISION || _la==ID_ENVIRONMENT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ED_COMMENT || _la==ED_TEXT) {
				{
				{
				setState(68);
				environmentDivisionSection();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ED_EOF) {
				{
				setState(74);
				match(ED_EOF);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentDivisionSectionContext extends ParserRuleContext {
		public TerminalNode ED_TEXT() { return getToken(CobolParser.ED_TEXT, 0); }
		public TerminalNode ED_COMMENT() { return getToken(CobolParser.ED_COMMENT, 0); }
		public TerminalNode COMMENT_END() { return getToken(CobolParser.COMMENT_END, 0); }
		public EnvironmentDivisionSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentDivisionSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterEnvironmentDivisionSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitEnvironmentDivisionSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitEnvironmentDivisionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironmentDivisionSectionContext environmentDivisionSection() throws RecognitionException {
		EnvironmentDivisionSectionContext _localctx = new EnvironmentDivisionSectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_environmentDivisionSection);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ED_TEXT);
				}
				break;
			case ED_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(ED_COMMENT);
				setState(79);
				match(COMMENT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDivisionContext extends ParserRuleContext {
		public TerminalNode DATA_DIVISION() { return getToken(CobolParser.DATA_DIVISION, 0); }
		public TerminalNode ID_DATA_CLOSE() { return getToken(CobolParser.ID_DATA_CLOSE, 0); }
		public TerminalNode ED_DATA_CLOSE() { return getToken(CobolParser.ED_DATA_CLOSE, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(CobolParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CobolParser.COMMENT, i);
		}
		public List<TerminalNode> COMMENT_END() { return getTokens(CobolParser.COMMENT_END); }
		public TerminalNode COMMENT_END(int i) {
			return getToken(CobolParser.COMMENT_END, i);
		}
		public List<DataDivisionSectionContext> dataDivisionSection() {
			return getRuleContexts(DataDivisionSectionContext.class);
		}
		public DataDivisionSectionContext dataDivisionSection(int i) {
			return getRuleContext(DataDivisionSectionContext.class,i);
		}
		public TerminalNode DD_EOF() { return getToken(CobolParser.DD_EOF, 0); }
		public DataDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDivisionContext dataDivision() throws RecognitionException {
		DataDivisionContext _localctx = new DataDivisionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataDivision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(82);
				match(COMMENT);
				setState(83);
				match(COMMENT_END);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATA_DIVISION) | (1L << ID_DATA_CLOSE) | (1L << ED_DATA_CLOSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DD_COMMENT || _la==DD_TEXT) {
				{
				{
				setState(90);
				dataDivisionSection();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DD_EOF) {
				{
				setState(96);
				match(DD_EOF);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDivisionSectionContext extends ParserRuleContext {
		public TerminalNode DD_TEXT() { return getToken(CobolParser.DD_TEXT, 0); }
		public TerminalNode DD_COMMENT() { return getToken(CobolParser.DD_COMMENT, 0); }
		public TerminalNode COMMENT_END() { return getToken(CobolParser.COMMENT_END, 0); }
		public DataDivisionSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDivisionSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataDivisionSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataDivisionSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataDivisionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDivisionSectionContext dataDivisionSection() throws RecognitionException {
		DataDivisionSectionContext _localctx = new DataDivisionSectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataDivisionSection);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(DD_TEXT);
				}
				break;
			case DD_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(DD_COMMENT);
				setState(101);
				match(COMMENT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDivisionContext extends ParserRuleContext {
		public TerminalNode PROCEDURE_DIVISION() { return getToken(CobolParser.PROCEDURE_DIVISION, 0); }
		public TerminalNode DD_PROCEDURE_CLOSE() { return getToken(CobolParser.DD_PROCEDURE_CLOSE, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(CobolParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CobolParser.COMMENT, i);
		}
		public List<TerminalNode> COMMENT_END() { return getTokens(CobolParser.COMMENT_END); }
		public TerminalNode COMMENT_END(int i) {
			return getToken(CobolParser.COMMENT_END, i);
		}
		public List<ProcedureDivisionSectionContext> procedureDivisionSection() {
			return getRuleContexts(ProcedureDivisionSectionContext.class);
		}
		public ProcedureDivisionSectionContext procedureDivisionSection(int i) {
			return getRuleContext(ProcedureDivisionSectionContext.class,i);
		}
		public TerminalNode PD_EOF() { return getToken(CobolParser.PD_EOF, 0); }
		public ProcedureDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterProcedureDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitProcedureDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitProcedureDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDivisionContext procedureDivision() throws RecognitionException {
		ProcedureDivisionContext _localctx = new ProcedureDivisionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_procedureDivision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(104);
				match(COMMENT);
				setState(105);
				match(COMMENT_END);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE_DIVISION || _la==DD_PROCEDURE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PD_COMMENT || _la==PD_TEXT) {
				{
				{
				setState(112);
				procedureDivisionSection();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PD_EOF) {
				{
				setState(118);
				match(PD_EOF);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDivisionSectionContext extends ParserRuleContext {
		public TerminalNode PD_TEXT() { return getToken(CobolParser.PD_TEXT, 0); }
		public TerminalNode PD_COMMENT() { return getToken(CobolParser.PD_COMMENT, 0); }
		public TerminalNode COMMENT_END() { return getToken(CobolParser.COMMENT_END, 0); }
		public ProcedureDivisionSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDivisionSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterProcedureDivisionSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitProcedureDivisionSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitProcedureDivisionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDivisionSectionContext procedureDivisionSection() throws RecognitionException {
		ProcedureDivisionSectionContext _localctx = new ProcedureDivisionSectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procedureDivisionSection);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(PD_TEXT);
				}
				break;
			case PD_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(PD_COMMENT);
				setState(123);
				match(COMMENT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0081\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\5\3\36\n\3\3\3\5\3!\n\3\3\3\5\3"+
		"$\n\3\3\3\5\3\'\n\3\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\7\4\62\n\4"+
		"\f\4\16\4\65\13\4\3\4\5\48\n\4\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\7\6A\n\6\f"+
		"\6\16\6D\13\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\5\6N\n\6\3\7\3\7\3\7"+
		"\5\7S\n\7\3\b\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13"+
		"\b\3\b\5\bd\n\b\3\t\3\t\3\t\5\ti\n\t\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3"+
		"\n\3\n\7\nt\n\n\f\n\16\nw\13\n\3\n\5\nz\n\n\3\13\3\13\3\13\5\13\177\n"+
		"\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\4\2\7\7\22\22\5\2\b\b\23\23"+
		"\31\31\4\2\t\t\37\37\2\u008b\2\27\3\2\2\2\4\33\3\2\2\2\6,\3\2\2\2\b<\3"+
		"\2\2\2\nB\3\2\2\2\fR\3\2\2\2\16X\3\2\2\2\20h\3\2\2\2\22n\3\2\2\2\24~\3"+
		"\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\3\3\2\2\2\33\35\5\6\4\2\34\36\5\n\6\2\35\34\3\2\2\2\35\36\3"+
		"\2\2\2\36 \3\2\2\2\37!\5\16\b\2 \37\3\2\2\2 !\3\2\2\2!#\3\2\2\2\"$\5\22"+
		"\n\2#\"\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'\7\f\2\2&%\3\2\2\2&\'\3\2\2\2\'"+
		"\5\3\2\2\2()\7\5\2\2)+\7\r\2\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-/\3\2\2\2.,\3\2\2\2/\63\7\6\2\2\60\62\5\b\5\2\61\60\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\668\7\20"+
		"\2\2\67\66\3\2\2\2\678\3\2\2\28\7\3\2\2\29=\7\25\2\2:;\7\21\2\2;=\7\r"+
		"\2\2<9\3\2\2\2<:\3\2\2\2=\t\3\2\2\2>?\7\5\2\2?A\7\r\2\2@>\3\2\2\2AD\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EI\t\2\2\2FH\5\f\7\2GF\3"+
		"\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\7\27\2\2ML"+
		"\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OS\7\33\2\2PQ\7\30\2\2QS\7\r\2\2RO\3\2\2"+
		"\2RP\3\2\2\2S\r\3\2\2\2TU\7\5\2\2UW\7\r\2\2VT\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[_\t\3\2\2\\^\5\20\t\2]\\\3\2\2\2^a"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\7\35\2\2cb\3\2\2\2"+
		"cd\3\2\2\2d\17\3\2\2\2ei\7 \2\2fg\7\36\2\2gi\7\r\2\2he\3\2\2\2hf\3\2\2"+
		"\2i\21\3\2\2\2jk\7\5\2\2km\7\r\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2oq\3\2\2\2pn\3\2\2\2qu\t\4\2\2rt\5\24\13\2sr\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xz\7\"\2\2yx\3\2\2\2yz\3\2\2\2z\23"+
		"\3\2\2\2{\177\7$\2\2|}\7#\2\2}\177\7\r\2\2~{\3\2\2\2~|\3\2\2\2\177\25"+
		"\3\2\2\2\27\31\35 #&,\63\67<BIMRX_chnuy~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}