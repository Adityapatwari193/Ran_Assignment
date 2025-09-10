public class Node {
    protected String id;
    protected String vendor;

    public Node(String id, String vendor) {
        this.id = id;
        this.vendor = vendor;
    }

    public String getInfo() {
        return "Node[id=" + id + ", vendor=" + vendor + "]";
    }

    @Override
    public String toString() { return getInfo(); }
}


