public class Main {

    public static void main(String[] args) {

        // Creating Society
        Society society = new Society(
            "Green Valley Housing Society", 3
        );

        // Creating Blocks
        Block blockA = new Block("A", 5);
        Block blockB = new Block("B", 5);

        // Adding Blocks
        society.addBlock(blockA);
        society.addBlock(blockB);


        // Creating Plots
        Plot p1 = new ResidentialPlot(5.0);
        Plot p2 = new CommercialPlot(10.0);
        Plot p3 = new CommunityPlot(15.0);

        Plot p4 = new ResidentialPlot(7.0);
        Plot p5 = new CommercialPlot(12.0);


        // Adding Plots to Blocks
        blockA.addPlot(p1);
        blockA.addPlot(p2);
        blockA.addPlot(p3);

        blockB.addPlot(p4);
        blockB.addPlot(p5);


        // Assigning Owners
        blockA.assignOwner(0, "Ali");
        blockA.assignOwner(1, "Ahmed");

        blockB.assignOwner(0, "Usman");


        // Display Society
        society.displaySociety();
    }
}