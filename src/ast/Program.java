package ast;

import eval.State;

import java.util.List;

public class Program extends AST {
    private List<FuncDef> funcDefs;
    private Body body;

    public Program(List<FuncDef> funcDefs, Body body){
        this.funcDefs = funcDefs;
        this.body = body;
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        this.funcDefs.forEach(stringBuilder::append);
//        stringBuilder.append(" ");
//        stringBuilder.append(this.body);
//        return stringBuilder.toString();
//    }

    @Override
    public int eval() {
        State<FuncDef> funcs = new State<>();
        funcDefs.forEach(funcDef -> funcDef.eval(funcs));

        return body.eval(new State<>(), funcs);
    }
}
