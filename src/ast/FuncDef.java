package ast;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FuncDef extends AST {
    private Head head;
    private Body body;

    public FuncDef(Head head, Body body){
        this.head = head;
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    @Override
    public String gen() {
        //TODO : A FAIRE
        throw new NotImplementedException();
    }



}
