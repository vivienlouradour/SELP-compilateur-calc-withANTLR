package ast;

import calc.SemanticException;

import java.util.List;

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
    public String gen(List<Variable> vars) {
        return "( " + leftExpression.gen(vars) + " " + operande.toString() + " " + rightExpression.gen(vars) + " )";
//        return leftExpression.toString() + " " + operande.toString() + " " + rightExpression.toString();
    }

    @Override
    public ASTType getType(){
        switch (this.operande.toString()){
            case "+" :
            case "-" :
            case "*" :
            case "/" :
                if(this.leftExpression.getType() != ASTType.Literal)
                    throw new SemanticException(this.leftExpression.toString() + " must be a literal expression");
                if(this.rightExpression.getType() != ASTType.Literal)
                    throw new SemanticException(this.rightExpression.toString() + " must be a literal expression");
                return ASTType.Literal;

            case "<" :
            case "<=" :
            case ">" :
            case ">=" :
                if(this.leftExpression.getType() != ASTType.Literal)
                    throw new SemanticException(this.leftExpression.toString() + " must be a literal expression");
                if(this.rightExpression.getType() != ASTType.Literal)
                    throw new SemanticException(this.rightExpression.toString() + " must be a literal expression");
                return ASTType.Boolean;

            case "==" :
            case "!=" :
                if(this.leftExpression.getType() != this.rightExpression.getType())
                    throw new SemanticException("Both expressions has to be same type");
                return ASTType.Boolean;

            case "&&" :
            case "||" :
                if(this.leftExpression.getType() != ASTType.Boolean)
                    throw new SemanticException(this.leftExpression.toString() + " must be a boolean expression");
                if(this.rightExpression.getType() != ASTType.Boolean)
                    throw new SemanticException(this.rightExpression.toString() + " must be a boolean expression");
                return ASTType.Boolean;

//            case "!" : return ASTType.Boolean;
            default: throw new RuntimeException();
        }
    }

}
