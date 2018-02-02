package ast;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class FunctionCall extends Expression{
    private Function function;

    private List<Expression> expressions;

    public FunctionCall(Function function, List<Expression> expressions) {
        this.function = function;
        this.expressions = expressions;
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
