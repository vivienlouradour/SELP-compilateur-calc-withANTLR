package ast;

import eval.State;

import java.util.List;

public class Body extends AST {
    private List<VarDef> defs;
    private Expression exp;

    public Body(List<VarDef> defs, Expression exp) {
        this.defs = defs;
        this.exp = exp;
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        this.defs.forEach(stringBuilder::append);
//        stringBuilder.append(" ");
//        stringBuilder.append(this.exp);
//        return stringBuilder.toString();
//    }

    @Override
    public int eval() {
        return 0;
    }

    @Override
    public String gen() {
        String result = "#include <stdio.h>\n"
                        + "\n"
                        + "int main() {\n"
                        + " return printf(\"%i\\n\", " + exp.gen() + ");\n"
                        + "}\n"; //TODO; a changer plus tard vers Program
        return result;
    }


    public int eval(State<Integer> vars, State<FuncDef> funcs){
        this.defs.forEach(varDef -> varDef.eval(vars, funcs));
        return this.exp.eval(vars, funcs);

    }
}
