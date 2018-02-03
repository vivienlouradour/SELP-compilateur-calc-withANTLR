package ast;

import calc.SemanticException;
import eval.State;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class VarDef extends AST {
    private Variable varId;
    private Expression expr;

    public VarDef(Variable varId, Expression expr) {
        this.varId = varId;
        this.expr = expr;
    }



    @Override
    public String gen() {
        return "int " + this.varId.getValue() + " = " + this.expr.gen() + ";";
    }

    @Override
    public ASTType getType() {
        throw new NotImplementedException();
    }

    @Override
    public void checkDeclarations(State<ASTType> vars) {
        //Si la variable à déjà été définie
        if(vars.lookup(this.varId.getValue()) != null)
            throw new SemanticException(this + " already defined.");


        this.expr.checkDeclarations(vars);
        vars.put(this.varId.getValue(), this.expr.getType());
    }
}
