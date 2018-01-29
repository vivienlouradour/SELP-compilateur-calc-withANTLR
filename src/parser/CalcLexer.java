// Generated from /home/vivien/Documents/IMT-A1/Langages-de-programmation/Partie2 - Structure et execution des langages de programmation/CCalc/src/parser/Calc.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OpMult=7, OpRelational=8, 
		OpEquality=9, AND=10, OR=11, MINUS=12, PLUS=13, NOT=14, BOOLEAN=15, IDENTIFIER=16, 
		LITERAL=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "OpMult", "OpRelational", 
		"OpEquality", "AND", "OR", "MINUS", "PLUS", "NOT", "BOOLEAN", "IDENTIFIER", 
		"LITERAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'defun'", "')'", "'='", "'?'", "':'", null, null, null, 
		"'&&'", "'||'", "'-'", "'+'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "OpMult", "OpRelational", "OpEquality", 
		"AND", "OR", "MINUS", "PLUS", "NOT", "BOOLEAN", "IDENTIFIER", "LITERAL", 
		"WS"
	};
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t?\n\t\3\n\3\n\3\n\3\n\5\nE\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\\\n\20\3\21\3\21\7\21`\n\21\f\21\16\21"+
		"c\13\21\3\22\3\22\3\22\7\22h\n\22\f\22\16\22k\13\22\5\22m\n\22\3\23\6"+
		"\23p\n\23\r\23\16\23q\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\4\2,,\61"+
		"\61\4\2>>@@\4\2\62;c|\5\2\13\f\17\17\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2"+
		"\2\5)\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67"+
		"\3\2\2\2\21>\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27I\3\2\2\2\31L\3\2\2\2\33"+
		"N\3\2\2\2\35P\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#l\3\2\2\2%o\3\2\2\2\'(\7*"+
		"\2\2(\4\3\2\2\2)*\7f\2\2*+\7g\2\2+,\7h\2\2,-\7w\2\2-.\7p\2\2.\6\3\2\2"+
		"\2/\60\7+\2\2\60\b\3\2\2\2\61\62\7?\2\2\62\n\3\2\2\2\63\64\7A\2\2\64\f"+
		"\3\2\2\2\65\66\7<\2\2\66\16\3\2\2\2\678\t\2\2\28\20\3\2\2\29?\t\3\2\2"+
		":;\7>\2\2;?\7?\2\2<=\7@\2\2=?\7?\2\2>9\3\2\2\2>:\3\2\2\2><\3\2\2\2?\22"+
		"\3\2\2\2@A\7?\2\2AE\7?\2\2BC\7#\2\2CE\7?\2\2D@\3\2\2\2DB\3\2\2\2E\24\3"+
		"\2\2\2FG\7(\2\2GH\7(\2\2H\26\3\2\2\2IJ\7~\2\2JK\7~\2\2K\30\3\2\2\2LM\7"+
		"/\2\2M\32\3\2\2\2NO\7-\2\2O\34\3\2\2\2PQ\7#\2\2Q\36\3\2\2\2RS\7v\2\2S"+
		"T\7t\2\2TU\7w\2\2U\\\7g\2\2VW\7h\2\2WX\7c\2\2XY\7n\2\2YZ\7u\2\2Z\\\7g"+
		"\2\2[R\3\2\2\2[V\3\2\2\2\\ \3\2\2\2]a\4c|\2^`\t\4\2\2_^\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2b\"\3\2\2\2ca\3\2\2\2dm\7\62\2\2ei\4\63;\2fh\4"+
		"\62;\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2ld\3"+
		"\2\2\2le\3\2\2\2m$\3\2\2\2np\t\5\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3"+
		"\2\2\2rs\3\2\2\2st\b\23\2\2t&\3\2\2\2\n\2>D[ailq\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}