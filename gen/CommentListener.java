// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommentParser}.
 */
public interface CommentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommentParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CommentParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommentParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CommentParser.FileContext ctx);
}