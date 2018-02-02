package ast;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Function extends AST {
    private String identifier;

    public Function(String identifier){
        this.identifier = identifier;
    }

    public String getName(){
        return this.identifier;
    }

    @Override
    public String gen(List<Variable> vars) {
        //TODO : A FAIRE
        throw new NotImplementedException();
    }

    @Override
    public ASTType getType() {
        throw new NotImplementedException();
    }
}
