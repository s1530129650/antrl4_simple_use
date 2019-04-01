// Generated from ScriptParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScriptParser}.
 */
public interface ScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ScriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ScriptParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ScriptParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ScriptParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ScriptParser.PropertyContext ctx);
}