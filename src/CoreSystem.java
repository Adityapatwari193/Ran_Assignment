import java.util.*;
public class CoreSystem {
    private final List<CoreNode> coreNodes = new ArrayList<>();
    public void addNode(CoreNode n) { coreNodes.add(n); }
    public List<CoreNode> listNodes() { return coreNodes; }
}