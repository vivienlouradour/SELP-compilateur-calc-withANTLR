package ast;

import eval.State;
import parser.SemanticException;

public class Variable extends Expression {
    private String value;

    public String getValue() {
        return value;
    }

    public Variable(String value){
        this.value = value;
    }

//    @Override
//    public String toString() {
//        return "Variable(" + this.value + ")";
//    }

    @Override
    public int eval() {
        return 0;
    }

    @Override
    public int eval(State<Integer> vars, State<FuncDef> funcs) {
        Integer val = vars.lookup(this.value);
        if(val == null){
            throw new SemanticException("La variable " + this.value + " n'a pas été définie.");
        }
        return val;
    }
}
