package ast;

import eval.State;
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
