package agents;

import java.util.List;

public class PresentationAgent {

    public PresentationAgent() {
        // Initialize any presentation resources if needed
    }

    // Simple method to display insights to console (can be extended to generate reports)
    public void present(List<String> insights) {
        System.out.println("----- Insights Report -----");
        for (String insight : insights) {
            System.out.println("- " + insight);
        }
        System.out.println("---------------------------");
    }
}
