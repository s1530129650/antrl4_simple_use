// Generated from Assign.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssignParser}.
 */
public interface AssignListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssignParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AssignParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AssignParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AssignParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AssignParser.ExprContext ctx);
}