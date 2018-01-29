package ast;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Function extends AST {
    private String identifier;

    public Function(String identifier){
        this.identifier = identifier;
    }

    public String getName(){
        return this.identifier;
    }

    @Override
    public String gen() {
        //TODO : A FAIRE
        throw new NotImplementedException();
    }
}
