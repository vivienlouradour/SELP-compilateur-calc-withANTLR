package ast;

import eval.State;

public class ConditionalExpression extends Expression {
    private Expression exp1;
    private Expression exp2;
    private Expression exp3;

    public ConditionalExpression(Expression exp1, Expression exp2, Expression exp3){
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
    }

//    @Override
//    public String toString() {
//        return "IfExpression(" + exp1 + ", " + exp2 + ", " + exp3 + ")";
//    }

    @Override
    public int eval() {
        return 0;
    }

    @Override
    public int eval(State<Integer> state, State<FuncDef> funcs) {
        return exp1.eval(state, funcs) == 0 ? exp3.eval(state, funcs) : exp2.eval(state, funcs);
    }

}
