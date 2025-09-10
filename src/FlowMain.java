public class FlowMain {
    public static void main(String[] args) {
        RANNode gnb = new RANNode("gNB-22", "Nokia", "gNodeB");
        CoreNode amf = new CoreNode("AMF-1", "Ericsson", "AMF");

        // Optional: Interface object if you want to print it
        InterfaceLink n2 = new InterfaceLink(gnb, amf, "N2");
        System.out.println(n2.describe());

        boolean result = FlowSimulator.runRegistration(gnb, amf);
        System.out.println("Final outcome: " + (result ? "UE Registered (simulated)" : "UE Rejected (simulated)"));
        System.out.println("Core stats: total regs = " + amf.getRegistrationCount() +
                ", last decision = " + amf.getLastDecisionTime());
    }
}