package ast;

public class UnaryExpression extends Expression {
    private OP op;
    private Expression expression;

    public UnaryExpression(OP op, Expression expression){
        this.op = op;
        this.expression = expression;
    }

    @Override
    public String gen() {
        return "(" + op.gen() + "(" + expression.gen() + ")" + ")";
//        return op.gen() + " " + expression.gen();
    }
}
