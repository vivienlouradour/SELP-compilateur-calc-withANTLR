package ast;

import eval.State;
import parser.SemanticException;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends Expression{
    private Function function;

    private List<Expression> expressions;

    public FunctionCall(Function function, List<Expression> expressions) {
        this.function = function;
        this.expressions = expressions;
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("FunctionCall(");
//        stringBuilder.append(this.function);
//        for (Expression expression :expressions) {
//            stringBuilder.append(expression);
//            stringBuilder.append(" ");
//        }
//        stringBuilder.append(")");
//        return stringBuilder.toString();
//    }

    @Override
    public int eval() {
        return 0;
    }

    @Override
    public int eval(State<Integer> vars, State<FuncDef> funcs) {
        FuncDef func = funcs.lookup(this.function.getName());
        if(func == null)
            throw new SemanticException("La fonction (" + this.function.getName() + ") n'a pas été définie.");
        if(func.getHead().getVarIds().size() != this.expressions.size())
            throw new SemanticException("La fonction (" + this.function.getName()  + ") n'a pas le bon nombre de paramètres");

        List<Integer> args = new ArrayList<>();
        for (Expression expr: expressions) {
            args.add(expr.eval(vars, funcs));
        }

        return func.eval(args, funcs);
    }
}
