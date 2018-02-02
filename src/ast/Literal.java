package ast;


import java.util.List;

public class Literal extends Expression {
    private int value;
    public Literal(int value){
        this.value = value;
    }


    @Override
    public String gen(List<Variable> vars) {
        return Integer.toString(this.value);
    }

    @Override
    public ASTType getType() {
        return ASTType.Literal;
    }
}
