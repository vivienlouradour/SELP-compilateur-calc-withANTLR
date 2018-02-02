package ast;


public enum OP {
    //Add
    PLUS("+"),
    MINUS("-"),

    //Mult
    TIMES("*"),
    DIVIDE("/"),

    //Relational
    LESS("<"),
    LESSEQUAL("<="),
    MORE(">"),
    MOREEQUAL(">="),

    //Equality
    EQUALS("=="),
    NOTEQUALS("!="),

    //Logical
    AND("&&"),
    OR("||"),

    NOT("!");

    private final String value;

    private OP(String op){
        value = op;
    }

    @Override
    public String toString(){
        return this.value;
    }


    public static OP parseOP(String op){
        switch (op){
            case "+" : return PLUS;
            case "-" : return MINUS;

            case "*" : return TIMES;
            case "/" : return DIVIDE;

            case "<" : return LESS;
            case "<=" : return LESSEQUAL;
            case ">" : return MORE;
            case ">=" : return MOREEQUAL;

            case "==" : return EQUALS;
            case "!=" : return NOTEQUALS;

            case "&&" : return AND;
            case "||" : return OR;

            case "!" : return NOT;
            default: throw new RuntimeException();
        }
    }

}
