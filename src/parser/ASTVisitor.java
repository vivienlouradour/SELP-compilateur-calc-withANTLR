package parser;

import ast.*;
import ast.Boolean;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends CalcBaseVisitor<AST> {

    @Override
    public AST visitProgram(CalcParser.ProgramContext ctx){
        //retrieve ASTs for func definitions
        List<CalcParser.FuncDefContext> funcDefContexts = ctx.funcDef();
        List<FuncDef> funcDefs = new ArrayList<>();
        for(CalcParser.FuncDefContext funcDefContext : funcDefContexts){
            funcDefs.add((FuncDef)visit(funcDefContext));
        }

        //retrieve AST for body
        Body body = (Body)visit(ctx.body());

        return new Program(funcDefs, body);
    }

    @Override
    public AST visitFuncDef(CalcParser.FuncDefContext ctx){
        Head head = (Head)visit(ctx.head());
        Body body = (Body)visit(ctx.body());

        return new FuncDef(head, body);
    }

    @Override
    public AST visitHead(CalcParser.HeadContext ctx){
        //retrieve AST for funcId
        Function function = new Function(ctx.functionId().getText());

        //retrieve ASTs for variables
        List<CalcParser.VariableIdContext> variableIdContexts = ctx.variableId();
        List<Variable> variables = new ArrayList<>();
        for (CalcParser.VariableIdContext varId : variableIdContexts) {
            variables.add((Variable)visit(varId));
        }

        return new Head(function, variables);
    }

    @Override
    public AST visitBody(CalcParser.BodyContext ctx) {
        // retrieve ASTs for definitions
        List<CalcParser.VarDefContext> varDefCtxs = ctx.varDef();
        List<VarDef> varDefs = new ArrayList<>();
        for (CalcParser.VarDefContext varDefCtx : varDefCtxs)
            varDefs.add((VarDef)visit(varDefCtx));

        // retrieve AST for expression
        Expression expr = (Expression)visit(ctx.expression());
        // return AST for program
        return new Body(varDefs, expr);
    }

    @Override
    public AST visitVarDef(CalcParser.VarDefContext ctx){
        Variable varId = (Variable)visit(ctx.variableId());
        Expression expression = (Expression)visit(ctx.expression());

        return new VarDef(varId, expression);
    }

    @Override
    public AST visitLiteral(CalcParser.LiteralContext ctx) {
        return new Literal(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitVariableId(CalcParser.VariableIdContext ctx){
        return new Variable(ctx.getText());
    }

    @Override
    public AST visitVariable(CalcParser.VariableContext ctx){

        return new Variable(ctx.getText());
    }


    @Override
    public AST visitBoolean(CalcParser.BooleanContext ctx){
        return new Boolean(ctx.getChild(0).getText());
    }

    @Override
    public AST visitUnaryExpression(CalcParser.UnaryExpressionContext ctx){
        OP op = OP.parseOP(ctx.getChild(0).getText());
        Expression expression = (Expression)visit(ctx.expression()); //first operand
        return new UnaryExpression(op, expression);
    }

    @Override
    public AST visitTernaryExpression(CalcParser.TernaryExpressionContext ctx){
        List<CalcParser.ExpressionContext> expressionCtxs = ctx.expression();
        Expression expression1 = (Expression)visit(expressionCtxs.get(0));
        Expression expression2 = (Expression)visit(expressionCtxs.get(1));
        Expression expression3 = (Expression)visit(expressionCtxs.get(2));

        return new ConditionalExpression(expression1, expression2, expression3);
    }

    @Override
    public AST visitBinaryExpression(CalcParser.BinaryExpressionContext ctx){
        // recupere l'operateur
        OP op = OP.parseOP(ctx.getChild(1).getText());

        //recupere les deux expressions
        List<CalcParser.ExpressionContext> expressionCtxs = ctx.expression();
        Expression expression1 = (Expression)visit(expressionCtxs.get(0));
        Expression expression2 = (Expression)visit(expressionCtxs.get(1));

        return new BinaryExpression(op, expression1, expression2);
    }

    @Override
    public AST visitParExpression(CalcParser.ParExpressionContext ctx){
        return new ParExpression((Expression)visit(ctx.expression()));
    }

    @Override
    public AST visitFunctionCall(CalcParser.FunctionCallContext ctx){
        Function function = new Function(ctx.functionId().getText());
        List<CalcParser.ExpressionContext> expressionContexts = ctx.expression();
        List<Expression> expressions = new ArrayList<>();
        for (CalcParser.ExpressionContext expressionsCtx: expressionContexts) {
            expressions.add((Expression)visit(expressionsCtx));
        }

        return new FunctionCall(function, expressions);
    }
}
