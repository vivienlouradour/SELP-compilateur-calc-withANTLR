package ast;

import calc.SemanticException;
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

    @Override
    public String gen() {
        return "(" + exp1.gen() + " ? " + exp2.gen() + " : " + exp3.gen() + ")";
    }


    @Override
    public ASTType getType() {
        if(this.exp1.getType() != ASTType.Boolean)
            throw new SemanticException(this.exp1 + " must be a boolean expression.");
        if(this.exp2.getType() != this.exp3.getType())
            throw new SemanticException("Both expressions has to be the same type.");
        return this.exp2.getType();
    }

    @Override
    public void checkDeclarations(State<ASTType> vars) {
        this.exp1.checkDeclarations(vars);
        this.exp2.checkDeclarations(vars);
        this.exp3.checkDeclarations(vars);
    }

}
