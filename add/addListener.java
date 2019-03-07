// Generated from add.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link addParser}.
 */
public interface addListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link addParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(addParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link addParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(addParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link addParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(addParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link addParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(addParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link addParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(addParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link addParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(addParser.ExpContext ctx);
}