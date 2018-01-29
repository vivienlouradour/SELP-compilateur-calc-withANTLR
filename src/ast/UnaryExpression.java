package ast;

import eval.State;

public class UnaryExpression extends Expression {
    private Expression expression;

    public UnaryExpression(Expression expression){
        this.expression = expression;
    }

//    @Override
//    public String toString() {
//        return  "UnaryExpression(" + this.expression + ")";
//    }

    @Override
    public int eval() {
        return 0;
    }

    @Override
    public int eval(State<Integer> state, State<FuncDef> funcs) {

        return -1*(this.expression.eval(state, funcs));
    }
}
