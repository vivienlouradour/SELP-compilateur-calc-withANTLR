package ast;

import calc.SemanticException;

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
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("if(");
//        stringBuilder.append(exp1.gen());
//        stringBuilder.append("){ \n");
//        stringBuilder.append(AST.INDENT + exp2.gen() + "; \n");
//        stringBuilder.append("} \n");
//        stringBuilder.append("else{ \n");
//        stringBuilder.append(AST.INDENT + exp3.gen() + "; \n");
//        stringBuilder.append("} \n");
//
//        return stringBuilder.toString();

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

}
