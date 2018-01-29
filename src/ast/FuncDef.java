package ast;

import eval.State;
import parser.SemanticException;

import java.util.List;

public class FuncDef extends AST {
    private Head head;
    private Body body;

    public FuncDef(Head head, Body body){
        this.head = head;
        this.body = body;
    }

//    @Override
//    public String toString() {
//        return "( defun " + this.head + " " + this.body + " )";
//    }

    @Override
    public int eval() {
        return 0;
    }

    public Head getHead() {
        return head;
    }

    //Définition d'une fonction
    public void eval(State<FuncDef> funcs){
        String funcName = this.head.getFunction().getName();
        if(funcs.lookup(funcName) != null)
            throw new SemanticException("La fonction " + funcName + " a déjà été définie.");

        funcs.bind(funcName, this);
    }

    //Appel d'une fonction
    public int eval(List<Integer> args, State<FuncDef> funcs){
        State<Integer> vars = bindArguments(this.head.getVarIds(), args);
        return this.body.eval(vars, funcs);
    }

    private State<Integer> bindArguments(List<Variable> formals, List<Integer> args){
        State<Integer> vars = new State<>();
        for (int i =0 ; i< formals.size(); i++) {
            vars.bind(formals.get(i).getValue(), args.get(i));
        }
        return vars;
    }
}
