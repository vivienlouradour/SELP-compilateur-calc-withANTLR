package ast;

import eval.State;
import parser.SemanticException;

public class VarDef extends AST {
    private Variable varId;
    private Expression expr;

    public VarDef(Variable varId, Expression expr) {
        this.varId = varId;
        this.expr = expr;
    }


//    @Override
//    public String toString() {
//        return "VarDef(" + this.varId.getValue() + " = "+ this.expr + ")";
//    }

    @Override
    public int eval() {
        return 0;
    }

    public void eval(State<Integer> vars, State<FuncDef> funcs){
        String key = this.varId.getValue();
        Integer value = vars.lookup(key);
        //On ne peut pas redéfinir une variable
        if(value != null)
            throw new SemanticException(this.varId + " déjà déclarée dans ce Body.");

        vars.bind(key, this.expr.eval(vars, funcs));
    }
}
