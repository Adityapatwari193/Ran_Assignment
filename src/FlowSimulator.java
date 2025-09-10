public class FlowSimulator {
    public static boolean runRegistration(RANNode ran, CoreNode core) {
        System.out.println("[FLOW] Starting registration flow: " + ran.id + " -> " + core.id);
        boolean sent = ran.register(core);
        if (!sent) {
            System.out.println("[FLOW] Registration not sent.");
            return false;
        }
        boolean accepted = core.handleRegistration(ran);
        System.out.println("[FLOW] Result: " + (accepted ? "ACCEPTED" : "REJECTED"));
        return accepted;
    }
}