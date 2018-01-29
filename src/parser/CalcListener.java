// Generated from /home/vivien/Documents/IMT-A1/Langages-de-programmation/Partie2 - Structure et execution des langages de programmation/CCalc/src/parser/Calc.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(CalcParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(CalcParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(CalcParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(CalcParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CalcParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CalcParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(CalcParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(CalcParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(CalcParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(CalcParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(CalcParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(CalcParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CalcParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CalcParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CalcParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CalcParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CalcParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CalcParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(CalcParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(CalcParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(CalcParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(CalcParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 */
	void enterVariableId(CalcParser.VariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 */
	void exitVariableId(CalcParser.VariableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#functionId}.
	 * @param ctx the parse tree
	 */
	void enterFunctionId(CalcParser.FunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#functionId}.
	 * @param ctx the parse tree
	 */
	void exitFunctionId(CalcParser.FunctionIdContext ctx);
}