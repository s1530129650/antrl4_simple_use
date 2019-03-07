// Generated from Mathm.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathmParser}.
 */
public interface MathmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MathmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MathmParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MathmParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(MathmParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MathmParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(MathmParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MathmParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MathmParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MathmParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MathmParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link MathmParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(MathmParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link MathmParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(MathmParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MathmParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MathmParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MathmParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MathmParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MathmParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MathmParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(MathmParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(MathmParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(MathmParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MathmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(MathmParser.IntContext ctx);
}