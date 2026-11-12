class ResidentialPlot extends Plot {

    public ResidentialPlot(double area) {

        super(area);
    }

    @Override
    public void displayDetails() {

        System.out.println("Plot Type: Residential");
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Area: " + getArea());
        System.out.println("Allotted: " + getIsAllotted());
    }
}