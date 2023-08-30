// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnumParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(EnumParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnumParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(EnumParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnumParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EnumParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnumParser#enumDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDecl(EnumParser.EnumDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnumParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(EnumParser.IdContext ctx);
}