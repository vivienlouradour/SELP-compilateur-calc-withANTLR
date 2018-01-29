package ast;

public class Function extends AST {
    private String identifier;

    public Function(String identifier){
        this.identifier = identifier;
    }

//    @Override
//    public String toString() {
//        return "Function(" + this.identifier + ")";
//    }

    public String getName(){
        return this.identifier;
    }
    @Override
    public int eval() {
        return 0;
    }
}
