package ast;

import java.util.List;

public class Head extends AST {
    private Function funcId;
    private List<Variable> varIds;

    public Head(Function funcId, List<Variable> varIds) {
        this.funcId = funcId;
        this.varIds = varIds;
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("(");
//        stringBuilder.append(funcId);
//        varIds.forEach(stringBuilder::append);
//        stringBuilder.append(")");
//        return stringBuilder.toString();
//    }

    public Function getFunction(){
        return this.funcId;
    }

    public List<Variable> getVarIds() {
        return varIds;
    }

    @Override
    public int eval() {
        return 0;
    }
}
