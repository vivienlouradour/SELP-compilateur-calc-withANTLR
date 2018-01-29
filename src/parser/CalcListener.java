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
	 * Enter a parse tree produced by the {@code BinaryMultExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMultExpression(CalcParser.BinaryMultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryMultExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMultExpression(CalcParser.BinaryMultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryLogicalOrExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogicalOrExpression(CalcParser.BinaryLogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryLogicalOrExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogicalOrExpression(CalcParser.BinaryLogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryEqualityExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryEqualityExpression(CalcParser.BinaryEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryEqualityExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryEqualityExpression(CalcParser.BinaryEqualityExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code BinaryAddExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAddExpression(CalcParser.BinaryAddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAddExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAddExpression(CalcParser.BinaryAddExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CalcParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CalcParser.ConditionalExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code BinaryLogicalAndExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogicalAndExpression(CalcParser.BinaryLogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryLogicalAndExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogicalAndExpression(CalcParser.BinaryLogicalAndExpressionContext ctx);
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