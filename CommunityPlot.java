public class CommunityPlot extends Plot {

    public CommunityPlot(double area) {

        super(area);
    }

    @Override
    public void displayDetails() {

        System.out.println("Plot Type: Community");
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Area: " + getArea());
        System.out.println("Allotted: " + getIsAllotted());
    }
}