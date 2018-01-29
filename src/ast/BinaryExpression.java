package ast;

import ast.Expression;
import ast.FuncDef;
import ast.OP;
import eval.State;

public class BinaryExpression extends Expression {

    private Expression leftExpression;
    private Expression rightExpression;
    private OP operande;

    public BinaryExpression(OP operande, Expression leftExpression, Expression rightExpression){
        this.operande = operande;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int eval() {
        return 0;
    }

    @Override
    public int eval(State<Integer> vars, State<FuncDef> funcs) {
        int val1 = this.leftExpression.eval(vars, funcs);
        int val2 = this.rightExpression.eval(vars, funcs);
        switch (this.operande){
            case MINUS:
                return val1 - val2;
            case DIVIDE:
                return val1 / val2;
            case PLUS:
                return val1 + val2;
            case TIMES:
                return val1 * val2;
            case EQUALS:
                return val1 == val2 ? 1 : 0;
            case LESS:
                return val1 < val2 ? 1 : 0;
            default: return -1;
        }
    }

//    @Override
//    public String toString() {
//        return "BinaryExpression(" + this.operande + " " + this.leftExpression + " " + this.rightExpression + ")";
//    }
}
