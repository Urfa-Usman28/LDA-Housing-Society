public class Society {

    private String societyName;
    private Block[] blocks;
    private int blockCount;

    public Society(String societyName, int size) {

        this.societyName = societyName;
        blocks = new Block[size];
        blockCount = 0;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    // Add Block
    public void addBlock(Block block) {

        if (blockCount < blocks.length) {

            blocks[blockCount] = block;
            blockCount++;

            System.out.println("Block added successfully.");
        }
        else {
            System.out.println("No space available.");
        }
    }

    // Display Society
    public void displaySociety() {

        System.out.println("\nSociety: " + societyName);

        for (int i = 0; i < blockCount; i++) {

            blocks[i].displayPlots();
        }
    }
}