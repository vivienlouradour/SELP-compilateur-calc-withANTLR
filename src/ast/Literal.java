package ast;


public class Literal extends Expression {
    private int value;
    public Literal(int value){
        this.value = value;
    }


    @Override
    public String gen() {
        return Integer.toString(this.value);
    }
}
