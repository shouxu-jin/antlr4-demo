// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Tags extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_START=1, TEXT=2, TAG_STOP=3, TAG_STUFF=4;
	public static final int
		ISLAND=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ISLAND"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAG_START", "TEXT", "TAG_STOP", "TAG_STUFF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_START", "TEXT", "TAG_STOP", "TAG_STUFF"
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


	public Tags(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tags.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			TAG_START_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			TAG_STOP_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TAG_STUFF_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TAG_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			pushMode(ISLAND); more();
			break;
		}
	}
	private void TAG_STOP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			popMode();
			break;
		}
	}
	private void TAG_STUFF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			more();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0004\u001c\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000"+
		"\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003"+
		"\u0007\u0003\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"\u000f\b\u0001\u000b\u0001\f\u0001\u0010\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0004\u0003\u0017\b\u0003\u000b\u0003\f\u0003\u0018"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0002\u0001\u0004\u0002\u0006"+
		"\u0003\b\u0004\u0002\u0000\u0001\u0002\u0001\u0000<<\u0001\u0000>>\u001c"+
		"\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0001\u0006\u0001\u0000\u0000\u0000\u0001\b\u0001\u0000\u0000\u0000\u0002"+
		"\n\u0001\u0000\u0000\u0000\u0004\u000e\u0001\u0000\u0000\u0000\u0006\u0012"+
		"\u0001\u0000\u0000\u0000\b\u0016\u0001\u0000\u0000\u0000\n\u000b\u0005"+
		"<\u0000\u0000\u000b\f\u0006\u0000\u0000\u0000\f\u0003\u0001\u0000\u0000"+
		"\u0000\r\u000f\b\u0000\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0005\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0005>\u0000\u0000\u0013\u0014\u0006\u0002\u0001\u0000\u0014\u0007"+
		"\u0001\u0000\u0000\u0000\u0015\u0017\b\u0001\u0000\u0000\u0016\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0006\u0003\u0002\u0000\u001b\t\u0001\u0000"+
		"\u0000\u0000\u0004\u0000\u0001\u0010\u0018\u0003\u0001\u0000\u0000\u0001"+
		"\u0002\u0001\u0001\u0003\u0002";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}