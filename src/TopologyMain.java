import java.util.Arrays;
import java.util.List;

public class TopologyMain {
    public static void main(String[] args) {
        // Build systems
        RANSystem ran = new RANSystem();
        CoreSystem core = new CoreSystem();

        RANNode enb = new RANNode("eNB-5", "Huawei", "eNodeB");
        RANNode gnb = new RANNode("gNB-7", "Nokia", "gNodeB");
        ran.addNode(enb);
        ran.addNode(gnb);

        CoreNode mme = new CoreNode("MME-1", "Ericsson", "MME");
        CoreNode smf = new CoreNode("SMF-1", "Nokia", "SMF");
        core.addNode(mme);
        core.addNode(smf);

        // Interfaces
        List<InterfaceLink> links = Arrays.asList(
                new InterfaceLink(enb, mme, "S1"),
                new InterfaceLink(gnb, smf, "N11") // gNB -> SMF via AMF is typical; we simplify
        );

        // Print topology
        System.out.println("=== RAN Nodes ===");
        ran.listNodes().forEach(n -> System.out.println(" - " + n.getInfo()));
        System.out.println("=== Core Nodes ===");
        core.listNodes().forEach(n -> System.out.println(" - " + n.getInfo()));
        System.out.println("=== Interfaces ===");
        links.forEach(l -> System.out.println(" - " + l.describe()));
    }
}
