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
public class FieldParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Name=7, Int=8, WS=9, NL=10;
	public static final int
		RULE_field = 0, RULE_points = 1, RULE_burial = 2, RULE_location = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"field", "points", "burial", "location"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'scores'", "'points'", "'is'", "'buried'", "'at'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Name", "Int", "WS", "NL"
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

	public FieldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> NL() { return getTokens(FieldParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FieldParser.NL, i);
		}
		public TerminalNode EOF() { return getToken(FieldParser.EOF, 0); }
		public TerminalNode Name() { return getToken(FieldParser.Name, 0); }
		public List<PointsContext> points() {
			return getRuleContexts(PointsContext.class);
		}
		public PointsContext points(int i) {
			return getRuleContext(PointsContext.class,i);
		}
		public List<BurialContext> burial() {
			return getRuleContexts(BurialContext.class);
		}
		public BurialContext burial(int i) {
			return getRuleContext(BurialContext.class,i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FieldVisitor ) return ((FieldVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_field);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((FieldContext)_localctx).name = match(Name);
			setState(9);
			match(NL);
			setState(13); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(10);
					points();
					setState(11);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(15); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				burial();
				setState(18);
				match(NL);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			setState(24);
			match(EOF);
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
	public static class PointsContext extends ParserRuleContext {
		public Token treasure;
		public Token value;
		public List<TerminalNode> WS() { return getTokens(FieldParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FieldParser.WS, i);
		}
		public TerminalNode Name() { return getToken(FieldParser.Name, 0); }
		public TerminalNode Int() { return getToken(FieldParser.Int, 0); }
		public PointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_points; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitPoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FieldVisitor ) return ((FieldVisitor<? extends T>)visitor).visitPoints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointsContext points() throws RecognitionException {
		PointsContext _localctx = new PointsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_points);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((PointsContext)_localctx).treasure = match(Name);
			setState(27);
			match(WS);
			setState(28);
			match(T__0);
			setState(29);
			match(WS);
			setState(30);
			((PointsContext)_localctx).value = match(Int);
			setState(31);
			match(WS);
			setState(32);
			match(T__1);
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
	public static class BurialContext extends ParserRuleContext {
		public Token treasure;
		public LocationContext at;
		public List<TerminalNode> WS() { return getTokens(FieldParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FieldParser.WS, i);
		}
		public TerminalNode Name() { return getToken(FieldParser.Name, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public BurialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_burial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterBurial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitBurial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FieldVisitor ) return ((FieldVisitor<? extends T>)visitor).visitBurial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BurialContext burial() throws RecognitionException {
		BurialContext _localctx = new BurialContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_burial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((BurialContext)_localctx).treasure = match(Name);
			setState(35);
			match(WS);
			setState(36);
			match(T__2);
			setState(37);
			match(WS);
			setState(38);
			match(T__3);
			setState(39);
			match(WS);
			setState(40);
			match(T__4);
			setState(41);
			match(WS);
			setState(42);
			((BurialContext)_localctx).at = location();
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
	public static class LocationContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public List<TerminalNode> Int() { return getTokens(FieldParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(FieldParser.Int, i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FieldVisitor ) return ((FieldVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((LocationContext)_localctx).x = match(Int);
			setState(45);
			match(T__5);
			setState(46);
			((LocationContext)_localctx).y = match(Int);
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
		"\u0004\u0001\n1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000"+
		"\u000b\u0000\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004"+
		"\u0006\u0000\u0000.\u0000\b\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006,\u0001\u0000"+
		"\u0000\u0000\b\t\u0005\u0007\u0000\u0000\t\r\u0005\n\u0000\u0000\n\u000b"+
		"\u0003\u0002\u0001\u0000\u000b\f\u0005\n\u0000\u0000\f\u000e\u0001\u0000"+
		"\u0000\u0000\r\n\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0014\u0001\u0000\u0000\u0000\u0011\u0012\u0003\u0004\u0002\u0000"+
		"\u0012\u0013\u0005\n\u0000\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014"+
		"\u0011\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0007\u0000\u0000\u001b"+
		"\u001c\u0005\t\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e"+
		"\u0005\t\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f \u0005\t\u0000"+
		"\u0000 !\u0005\u0002\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0005"+
		"\u0007\u0000\u0000#$\u0005\t\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0005"+
		"\t\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005\t\u0000\u0000()\u0005"+
		"\u0005\u0000\u0000)*\u0005\t\u0000\u0000*+\u0003\u0006\u0003\u0000+\u0005"+
		"\u0001\u0000\u0000\u0000,-\u0005\b\u0000\u0000-.\u0005\u0006\u0000\u0000"+
		"./\u0005\b\u0000\u0000/\u0007\u0001\u0000\u0000\u0000\u0002\u000f\u0016";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}