package ast;


import eval.State;

public class Literal extends Expression {
    private int value;
    public Literal(int value){
        this.value = value;
    }

//    @Override
//    public String toString() {
//        return "Litteral(" + String.valueOf(this.value) + ")";
//    }

    @Override
    public int eval() {
        return this.value;
    }

    @Override
    public String gen() {
        return Integer.toString(this.value);
    }

    @Override
    public int eval(State<Integer> vars, State<FuncDef> funcs) {
        return this.value;
    }
}
