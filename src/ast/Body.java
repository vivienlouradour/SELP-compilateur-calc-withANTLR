package ast;

import java.util.List;

public class Body extends AST {
    private List<VarDef> defs;
    private Expression exp;

    public Body(List<VarDef> defs, Expression exp) {
        this.defs = defs;
        this.exp = exp;
    }



    @Override
    public String gen() {
        String result = "#include <stdio.h>\n"
                        + "\n"
                        + "int main() {\n"
                        + AST.INDENT + "return printf(\"%i\\n\", " + exp.gen() + ");\n"
                        + "}\n"; //TODO; a changer plus tard vers Program
        return result;
    }


}
