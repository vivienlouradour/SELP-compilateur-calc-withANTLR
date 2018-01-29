package ast;

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
    public String gen() {
//        return "( " + leftExpression.gen() + " " + operande.gen() + " " + rightExpression.gen() + " )";
        return leftExpression.gen() + " " + operande.gen() + " " + rightExpression.gen();
    }
}
