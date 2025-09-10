public class RANNode extends Node {
    private String ranType; // e.g., eNodeB, gNodeB

    public RANNode(String id, String vendor, String ranType) {
        super(id, vendor);
        this.ranType = ranType;
    }


    public boolean register(CoreNode target) {
        System.out.println("[RAN] " + id + " sending REGISTRATION to " + target.id + " via interface N2");
        // You could add simple checks (e.g., vendor allowlist) here
        return true; // assume the message is sent
    }


    @Override
    public String getInfo() {
        return "RANNode[id=" + id + ", vendor=" + vendor + ", type=" + ranType + "]";
    }
}