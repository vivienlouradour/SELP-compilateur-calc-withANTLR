package ast;

import eval.State;

public class ParExpression extends Expression{
    private Expression expression;

    public ParExpression(Expression expression){
        this.expression = expression;
    }

    @Override
    public String gen() {
        return "( " + this.expression.gen() + " )";
    }

    @Override
    public ASTType getType() {
        return this.expression.getType();
    }

    @Override
    public void checkDeclarations(State<ASTType> vars) {
        this.expression.checkDeclarations(vars);
    }
}
