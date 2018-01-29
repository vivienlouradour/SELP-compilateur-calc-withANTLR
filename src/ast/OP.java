package ast;


public enum OP {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE,
    EQUALS,
    LESS;

    public static OP parseOP(String op){
        switch (op){
            case "+" : return PLUS;
            case "-" : return MINUS;
            case "*" : return TIMES;
            case "/" : return DIVIDE;
            case "==" : return EQUALS;
            case "<" : return LESS;
            default: throw new RuntimeException(); //TODO : refine this preliminary hack
        }
    }
}
