package calc;

import ast.AST;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.*;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

//TODO : gestion des pb de compilation gcc (tests échous alors qu'ils ne devraient pas)
public class Calc {
    static boolean verbose = false;

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length>0 ) inputFile = args[0];
        if (args.length>1 && args[1].equals("-v") || args.length == 0) verbose = true;
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        // CalcLexer lexer = new CalcLexer(input);
        // error handling (lexical level)
        CalcLexer lexer = new ReportingCalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        // error handling (syntactic level)
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());
//        ParseTree tree = parser.program();
        ParseTree tree = parser.body();
        if (verbose)
            System.out.println(tree.toStringTree(parser));
        if (! ErrorFlag.getErrorFlag()) {
            ASTVisitor visitor = new ASTVisitor();
            AST ast = visitor.visit(tree);
//            int result = ((Expression)ast).eval();
//            if (verbose) { // for debugging purposes
//                int result = ((Body)ast).eval();
//                System.out.println(ast + " => " + result);
//            }
//            String code = ast.toString();
//            System.out.println(code);
//            write(code, inputFile);
            try{
                ast.check(); // Semantic analysis
                String code = ast.gen();
//                if(parser.consume() != null)
//                    throw new SyntaxError("EOF expected");
                if (inputFile != null)
                    write(code, inputFile);
                else
                    System.out.println(code);
            }
            catch (SemanticException ex) {
                throw ex;
            }
        }
        else
            throw new SyntaxError();
    }
    // write code to .c file associated to .calc file passed as argument,
    // returning .c file relative filename
    static String write(String code, String filename) throws IOException {
        String CFilename = filename.replaceFirst("\\.calc\\z", ".c");
        if (verbose) System.out.println("writing C code to " + CFilename);
        FileWriter out = new FileWriter(CFilename);
        out.write(code);
        out.flush();
        out.close();
        return CFilename;
    }
}

