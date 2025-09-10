// Main.java
public class Main {
    public static void main(String[] args) {
        RANNode gnb = new RANNode("gNB-101", "Nokia", "gNodeB");
        CoreNode amf = new CoreNode("AMF-1", "Ericsson", "AMF");
        InterfaceLink n2 = new InterfaceLink(gnb, amf, "N2");

        System.out.println(gnb);
        System.out.println(amf);
        System.out.println(n2.describe());
    }
}