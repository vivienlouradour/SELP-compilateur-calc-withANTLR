package ast;

import eval.State;

public class Boolean extends Expression{
    private boolean value;

    public Boolean(String value){
        this.value = java.lang.Boolean.parseBoolean(value);
    }

    @Override
    public String gen() {
        return value ? "1" : "0";
    }


    @Override
    public ASTType getType() {
        return ASTType.Boolean;
    }

    @Override
    public void checkDeclarations(State<ASTType> vars) {

    }

}
