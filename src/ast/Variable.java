package ast;

import calc.SemanticException;
import eval.State;

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
    public String gen() {
        return this.value;
    }

    @Override
    public ASTType getType() {
        return this.type;
    }

    @Override
    public void checkDeclarations(State<ASTType> vars) {
        ASTType varType = vars.lookup(this.value);
        if(varType == null)
            throw new SemanticException(this + " not defined.");

        this.setType(varType);
    }

    public void setType(ASTType type){
        this.type = type;
    }
}
