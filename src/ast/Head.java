package ast;

import eval.State;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Head extends AST {
    private Function funcId;
    private List<Variable> varIds;

    public Head(Function funcId, List<Variable> varIds) {
        this.funcId = funcId;
        this.varIds = varIds;
    }



    public Function getFunction(){
        return this.funcId;
    }

    public List<Variable> getVarIds() {
        return varIds;
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

    @Override
    public void checkDeclarations(State<Variable> vars) {
        throw new NotImplementedException();
    }
}
