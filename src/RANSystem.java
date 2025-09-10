import java.util.*;
public class RANSystem {
    private final List<RANNode> ranNodes = new ArrayList<>();
    public void addNode(RANNode n) { ranNodes.add(n); }
    public List<RANNode> listNodes() { return ranNodes; }
}
