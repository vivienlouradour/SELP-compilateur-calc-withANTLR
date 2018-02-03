package ast;

import calc.SemanticException;
import eval.State;

import java.lang.reflect.Field;
import java.util.ArrayList;

public abstract class AST {
    public static String INDENT = "  ";

    public String toString() {
        // retrieve class of node
        Class<? extends AST> tclass = this.getClass();
        // isolate relative name (starting after the rightmost '.')
        String absoluteClassName = tclass.toString();
        int dotIndex = absoluteClassName.lastIndexOf(".", absoluteClassName.length());
        String relativeClassName = absoluteClassName.substring(dotIndex+1);
        // retrieving fields (note that, unfortunately, they are not ordered)
        // TO DO : get rid of static fields (pb in case of singletons)
        Field[] fields = tclass.getDeclaredFields();
        // building string representation of the arguments of the nodes
        int arity = fields.length;
        String args = "";
        for(int index = 0; index < arity; index++) {
            String arg;
            try {
                arg = fields[index].get(this).toString(); // retrieve string representation of all arguments
            } catch (Exception e) {
                arg = "?"; // IllegalArgument or IllegalAccess Exception (this shouldn't happen)
            }
            if (index != 0) // a separator is required before each argument except the first
                args = args + ", " + arg;
//				args = args + " " + arg;
            else
                args = args + arg;
        }
        return relativeClassName + "(" + args + ")";
//		return "<" + relativeClassName + ">" + args + "</" + relativeClassName + ">";
    }

    /**
     * Génère du code C
     * @return
     */
    public abstract String gen();


    /**
     * Vérifie la validité du typage du programme (boolean/int)
     * @throws SemanticException
     */
    public void check() throws SemanticException{
        this.checkDeclarations(new State<>());
        this.getType();
    }

    /**
     * Vérifie que les déclarations/appels de variables/fonctions sont cohérentes (check estDéfinie lors d'un appel et check !estDéfinie lors d'une définition)
     * Définie également le type de retour (Boolean/Literal) des variables/fonctions, sans vérifier la cohérence de type.
     * @throws SemanticException
     * @param vars
     */
    public abstract void checkDeclarations(State<Variable> vars) throws SemanticException;

    /**
     * Calcule le type de retour de l'AST (Boolean ou Literal).
     * Lance une SemanticException si il y a une incohérence de type (ex : a = 3 + true)
     * @throws SemanticException
     * @return
     */
    public abstract ASTType getType() throws SemanticException;
}
