package ast;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Program extends AST {
    private List<FuncDef> funcDefs;
    private Body body;

    public Program(List<FuncDef> funcDefs, Body body){
        this.funcDefs = funcDefs;
        this.body = body;
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
