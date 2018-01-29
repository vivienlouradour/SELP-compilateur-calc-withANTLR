package ast;

public class Variable extends Expression {
    private String value;

    public String getValue() {
        return value;
    }

    public Variable(String value){
        this.value = value;
    }

    @Override
    public String gen() {
        return this.value;
    }
}
