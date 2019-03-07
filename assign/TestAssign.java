import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestAssign {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        AssignLexer lexer = new AssignLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AssignParser parser = new AssignParser(tokens);

        ParseTree tree = parser.assign();

        System.out.println(tree.toStringTree(parser));
    }
}
