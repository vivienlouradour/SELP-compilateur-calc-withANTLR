package ast;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class VarDef extends AST {
    private Variable varId;
    private Expression expr;

    public VarDef(Variable varId, Expression expr) {
        this.varId = varId;
        this.expr = expr;
    }



    @Override
    public String gen(List<Variable> vars) {
        this.varId.setType(this.expr.getType());
        vars.add(this.varId);
        return "int " + this.varId.getValue() + " = " + this.expr.gen(vars) + ";";
    }

    @Override
    public ASTType getType() {
        throw new NotImplementedException();
    }
}
