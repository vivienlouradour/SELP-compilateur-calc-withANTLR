package ast;

public class Boolean extends Expression{
    private boolean value;

    public Boolean(String value){
        this.value = java.lang.Boolean.parseBoolean(value);
    }

    @Override
    public String gen() {
        return value ? "true" : "false";
    }
}
