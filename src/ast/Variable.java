package ast;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Variable extends Expression {
    private String value;

    public String getValue() {
        return value;
    }

    public Variable(String value){
        this.value = value;
    }

    @Override
    public String gen() {
        return this.value;
    }

    @Override
    public ASTType getType() {
        throw new NotImplementedException();
    }
}
