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



    @Override
    public String gen() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#include <stdio.h>\n\n");
        stringBuilder.append("int main() {\n");

        //Définition des variables
        defs.forEach(varDef -> stringBuilder.append(AST.INDENT + varDef.gen() + "\n"));

        stringBuilder.append(AST.INDENT + "return printf(\"%i\\n\", " + exp.gen() + ");\n");
        stringBuilder.append("}\n");

        return stringBuilder.toString();
    }

    @Override
    public ASTType getType() {
        return this.exp.getType();
    }

    @Override
    public void checkDeclarations(State<ASTType> vars) {
        defs.forEach(varDef -> varDef.checkDeclarations(vars));
        this.exp.checkDeclarations(vars);
    }
}
