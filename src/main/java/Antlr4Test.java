import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.Arrays;

public class Antlr4Test {
    public static void main(String[] args) throws IOException {
        FieldLexer l = new FieldLexer(new ANTLRInputStream(Antlr4Test.class.getResourceAsStream("/example.field")));
        FieldParser p = new FieldParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });
        System.out.println(Arrays.toString(p.getRuleNames()));
        System.out.println(Arrays.toString(p.getTokenNames()));
    }
}
