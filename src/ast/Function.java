package ast;

import eval.State;
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

    @Override
    public ASTType getType() {
        throw new NotImplementedException();
    }

    @Override
    public void checkDeclarations(State<ASTType> vars) {
        throw new NotImplementedException();
    }
}
