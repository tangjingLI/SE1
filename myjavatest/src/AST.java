import java.util.ArrayList;

public class AST {

    /*
    private Node[] node=new Node[]{null,null,null};
    private ArrayList<Node[]> tree=new ArrayList<Node[]>();

    public void setTree(ArrayList<Node[]> tree) {
        this.tree = tree;
    }

    public void setNode(Node[] node) {
        this.node = node;
    }

    public ArrayList<Node[]> getTree() {
        return tree;
    }

    public Node[] getNode() {
        return node;
    }


     */
    public enum Node{
        Identifier,Abstraction,Application;
    }
}
