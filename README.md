# Ran_Assignment

RAN Assignment (Telecom Simulation)

This project simulates a simplified telecom RAN (Radio Access Network) and Core system in Java.
It is structured in 3 assignments:

Assignment 1 – Create basic Node, RANNode, CoreNode, and InterfaceLink classes.

Assignment 2 – Group nodes into RANSystem and CoreSystem and print a small topology.

Assignment 3 – Simulate a basic signaling flow (RAN → Core registration) and log the messages.

Includes optional stretch goals: validation rules, metrics tracking, and topology serialization.

📂 Project Structure
src/
 ├── Node.java
 ├── RANNode.java
 ├── CoreNode.java
 ├── InterfaceLink.java
 ├── RANSystem.java
 ├── CoreSystem.java
 ├── TopologyMain.java       # Runs Assignment 2
 ├── FlowSimulator.java
 ├── FlowMain.java           # Runs Assignment 3

🚀 Setup Instructions
1. Prerequisites

Install Java 17 (or higher).

Install IntelliJ IDEA (Community Edition is enough).

Install Git (for version control).

2. Clone the Repository
git clone https://github.com/Adityapatwari193/Ran_Assignment.git
cd Ran_Assignment

3. Open in IntelliJ

Start IntelliJ IDEA.

Choose Open Project → select the cloned folder.

IntelliJ will detect the Java project automatically.

4. Build & Run

To run Assignment 2 (topology):
Open TopologyMain.java → Right-click → Run 'TopologyMain.main()'

To run Assignment 3 (flow simulation):
Open FlowMain.java → Right-click → Run 'FlowMain.main()'

📝 Example Outputs
Assignment 2 (Topology)
=== RAN Nodes ===
 - RANNode[id=eNB-5, vendor=Huawei, type=eNodeB]
 - RANNode[id=gNB-7, vendor=Nokia, type=gNodeB]
=== Core Nodes ===
 - CoreNode[id=MME-1, vendor=Ericsson, func=MME]
 - CoreNode[id=SMF-1, vendor=Nokia, func=SMF]
=== Interfaces ===
 - Interface[S1: eNB-5 -> MME-1]
 - Interface[N11: gNB-7 -> SMF-1]

Assignment 3 (Registration Flow)
Interface[N2: gNB-22 -> AMF-1]
[FLOW] Starting registration flow: gNB-22 -> AMF-1
[RAN] gNB-22 sending REGISTRATION to AMF-1 via interface N2
[CORE-AMF] AMF-1 received REGISTRATION from gNB-22
[CORE-AMF] Decision: ACCEPT
[FLOW] Result: ACCEPTED
Final outcome: UE Registered (simulated)
Core stats: total regs = 1, last decision = 1757481266610
