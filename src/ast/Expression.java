package ast;

import eval.State;

public abstract class Expression extends AST {
    public abstract int eval();
    public abstract int eval(State<Integer> vars, State<FuncDef> funcs);
}
