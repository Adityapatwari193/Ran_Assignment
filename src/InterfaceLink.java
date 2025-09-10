public class InterfaceLink {
    private final Node src;
    private final Node dst;
    private final String name; // e.g., N2, S1

    public InterfaceLink(Node src, Node dst, String name) {
        this.src = src;
        this.dst = dst;
        this.name = name;
    }

    public String describe() {
        return "Interface[" + name + "]: " + src.getInfo() + " --> " + dst.getInfo();
    }
}