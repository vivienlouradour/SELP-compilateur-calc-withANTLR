package ast;

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
        //TODO : A FAIRE
        throw new NotImplementedException();
    }

    @Override
    public ASTType getType() {
        throw new NotImplementedException();
    }
}
