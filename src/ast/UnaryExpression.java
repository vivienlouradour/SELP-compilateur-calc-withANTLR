package ast;

import calc.SemanticException;

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

    @Override
    public ASTType getType() {
        switch (this.op.gen()){
            case "-":
                if(this.expression.getType() != ASTType.Literal)
                    throw new SemanticException(this.expression + " must be literal expression.");
                return ASTType.Literal;
            case "!":
                if(this.expression.getType() != ASTType.Boolean)
                    throw new SemanticException(this.expression + " must be boolean expression.");
                return ASTType.Boolean;
            default:
                throw new RuntimeException();
        }
    }
}
