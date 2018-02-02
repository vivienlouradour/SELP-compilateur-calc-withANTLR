package ast;

import java.util.List;

public class Boolean extends Expression{
    private boolean value;

    public Boolean(String value){
        this.value = java.lang.Boolean.parseBoolean(value);
    }

    @Override
    public String gen(List<Variable> vars) {
        return value ? "1" : "0";
    }


    @Override
    public ASTType getType() {
        return ASTType.Boolean;
    }

}
