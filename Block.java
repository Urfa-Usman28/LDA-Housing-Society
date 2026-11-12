public class Block {

    private String blockName;
    private Plot[] plots;
    private int plotCount;

    public Block(String blockName, int size) {

        this.blockName = blockName;
        plots = new Plot[size];
        plotCount = 0;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    // Add Plot
    public void addPlot(Plot plot) {

        if (plotCount < plots.length) {

            plots[plotCount] = plot;
            plotCount++;

            System.out.println("Plot added successfully.");
        }
        else {
            System.out.println("No space available.");
        }
    }

    // Assign Owner
    public void assignOwner(int plotIndex, String ownerName) {

        if (plotIndex >= 0 && plotIndex < plotCount) {

            plots[plotIndex].assignOwner(ownerName);

            System.out.println("Owner assigned successfully.");
        }
        else {
            System.out.println("Invalid plot number.");
        }
    }

    // Remove Owner
    public void removeOwner(int plotIndex) {

        if (plotIndex >= 0 && plotIndex < plotCount) {

            plots[plotIndex].removeOwner();

            System.out.println("Owner removed successfully.");
        }
        else {
            System.out.println("Invalid plot number.");
        }
    }

    // Display Plots
    public void displayPlots() {

        System.out.println("\nBlock: " + blockName);

        for (int i = 0; i < plotCount; i++) {

            System.out.println("\nPlot Number: " + (i + 1));

            plots[i].displayDetails();
        }
    }
}