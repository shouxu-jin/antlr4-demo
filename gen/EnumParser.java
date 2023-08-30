// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EnumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, INT=8, WS=9;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_enumDecl = 3, RULE_id = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "enumDecl", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'enum'", "'{'", "','", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "INT", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public static boolean java5;
	public EnumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<EnumDeclContext> enumDecl() {
			return getRuleContexts(EnumDeclContext.class);
		}
		public EnumDeclContext enumDecl(int i) {
			return getRuleContext(EnumDeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnumVisitor ) return ((EnumVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(12);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(10);
						stat();
						}
						break;
					case 2:
						{
						setState(11);
						enumDecl();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(14); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public IdContext id;
		public ExprContext expr;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnumVisitor ) return ((EnumVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((StatContext)_localctx).id = id();
			setState(17);
			match(T__0);
			setState(18);
			((StatContext)_localctx).expr = expr();
			setState(19);
			match(T__1);
			System.out.println((((StatContext)_localctx).id!=null?_input.getText(((StatContext)_localctx).id.start,((StatContext)_localctx).id.stop):null)+"="+(((StatContext)_localctx).expr!=null?_input.getText(((StatContext)_localctx).expr.start,((StatContext)_localctx).expr.stop):null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INT() { return getToken(EnumParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnumVisitor ) return ((EnumVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(INT);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclContext extends ParserRuleContext {
		public IdContext name;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public EnumDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).exitEnumDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnumVisitor ) return ((EnumVisitor<? extends T>)visitor).visitEnumDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclContext enumDecl() throws RecognitionException {
		EnumDeclContext _localctx = new EnumDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enumDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			if (!(java5)) throw new FailedPredicateException(this, "java5");
			setState(27);
			match(T__2);
			setState(28);
			((EnumDeclContext)_localctx).name = id();
			setState(29);
			match(T__3);
			setState(30);
			id();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(31);
				match(T__4);
				setState(32);
				id();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__5);
			System.out.println("enum "+(((EnumDeclContext)_localctx).name!=null?_input.getText(((EnumDeclContext)_localctx).name.start,((EnumDeclContext)_localctx).name.stop):null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnumParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnumListener ) ((EnumListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnumVisitor ) return ((EnumVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				if (!(!java5)) throw new FailedPredicateException(this, "!java5");
				setState(43);
				match(T__2);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return enumDecl_sempred((EnumDeclContext)_localctx, predIndex);
		case 4:
			return id_sempred((IdContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean enumDecl_sempred(EnumDeclContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return java5;
		}
		return true;
	}
	private boolean id_sempred(IdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !java5;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t/\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\r\b\u0000\u000b\u0000\f\u0000\u000e\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0019\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\"\b"+
		"\u0003\n\u0003\f\u0003%\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004-\b\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000.\u0000\f\u0001\u0000"+
		"\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u0004\u0018\u0001\u0000"+
		"\u0000\u0000\u0006\u001a\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000"+
		"\u0000\n\r\u0003\u0002\u0001\u0000\u000b\r\u0003\u0006\u0003\u0000\f\n"+
		"\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000"+
		"\u0000\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0003\b\u0004"+
		"\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u0013\u0003\u0004\u0002"+
		"\u0000\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u0015\u0006\u0001\uffff"+
		"\uffff\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0019\u0003\b\u0004"+
		"\u0000\u0017\u0019\u0005\b\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u0005\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0004\u0003\u0000\u0000\u001b\u001c\u0005\u0003\u0000\u0000"+
		"\u001c\u001d\u0003\b\u0004\u0000\u001d\u001e\u0005\u0004\u0000\u0000\u001e"+
		"#\u0003\b\u0004\u0000\u001f \u0005\u0005\u0000\u0000 \"\u0003\b\u0004"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\'\u0005\u0006\u0000\u0000\'(\u0006\u0003\uffff"+
		"\uffff\u0000(\u0007\u0001\u0000\u0000\u0000)-\u0005\u0007\u0000\u0000"+
		"*+\u0004\u0004\u0001\u0000+-\u0005\u0003\u0000\u0000,)\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-\t\u0001\u0000\u0000\u0000\u0005\f\u000e"+
		"\u0018#,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}