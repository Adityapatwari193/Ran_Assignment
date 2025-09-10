public class CoreNode extends Node {
    private String coreFunc; // e.g., MME, AMF, SMF
    private int registrationCount = 0;
    private long lastDecisionTime = 0;


    public CoreNode(String id, String vendor, String coreFunc) {
        super(id, vendor);
        this.coreFunc = coreFunc;
    }
    public int getRegistrationCount() { return registrationCount; }
    public long getLastDecisionTime() { return lastDecisionTime; }


    public boolean handleRegistration(RANNode source) {
        registrationCount++;
        lastDecisionTime = System.currentTimeMillis();
        System.out.println("[CORE-" + coreFunc + "] " + id + " received REGISTRATION from " + source.id);
        // Very simple acceptance rule (demo)
        boolean ok = !"BLACKLIST_VENDOR".equalsIgnoreCase(source.vendor);
        System.out.println("[CORE-" + coreFunc + "] Decision: " + (ok ? "ACCEPT" : "REJECT"));
        return ok;
    }

    @Override
    public String getInfo() {
        return "CoreNode[id=" + id + ", vendor=" + vendor + ", func=" + coreFunc + "]";
    }
}
