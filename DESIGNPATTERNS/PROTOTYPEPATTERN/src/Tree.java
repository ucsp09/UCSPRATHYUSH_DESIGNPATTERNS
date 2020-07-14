package PROTOTYPEPATTERN.src;
import java.util.HashMap;

public class Tree {
    private static HashMap<String,Node> clones =new HashMap<String,Node>();
    static
    {
        clones.put("Leaf",new LeafNode());
        clones.put("Partial",new PartialNode());
        clones.put("Full",new FullNode());
    }
    public Node getNode(String nodeName)
    {
        return (Node) clones.get(nodeName).clone();
    }
}