package ast;

import calc.SemanticException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;

public class Variable extends Expression {
    private String value;

    public String getValue() {
        return value;
    }

    private ASTType type;

    public Variable(String value){
        this.value = value;
    }

    @Override
    public String gen(List<Variable> vars) {

        Optional<Variable> variable = vars.stream().filter(var -> var.getValue().equals(this.getValue())).findAny();
        if(!variable.isPresent())
            throw new SemanticException(this + " not defined.");
        this.setType(variable.get().getType());
        return this.value;
    }

    @Override
    public ASTType getType() {
        return this.type;
    }

    public void setType(ASTType type){
        this.type = type;
    }
}
