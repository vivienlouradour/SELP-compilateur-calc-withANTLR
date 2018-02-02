package ast;

import java.util.List;

public class ParExpression extends Expression{
    private Expression expression;

    public ParExpression(Expression expression){
        this.expression = expression;
    }

    @Override
    public String gen(List<Variable> vars) {
        return "( " + this.expression.gen(vars) + " )";
    }

    @Override
    public ASTType getType() {
        return this.expression.getType();
    }
}
