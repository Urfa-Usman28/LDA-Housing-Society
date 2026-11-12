abstract class Plot {

    private String ownerName;
    private double area;
    private boolean isAllotted;

   
    public Plot(double area) {

        this.ownerName = "No Owner";
        this.area = area;
        this.isAllotted = false;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public double getArea() {
        return area;
    }

    public boolean getIsAllotted() {
        return isAllotted;
    }

    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setIsAllotted(boolean isAllotted) {
        this.isAllotted = isAllotted;
    }

    public void assignOwner(String ownerName) {

        this.ownerName = ownerName;
        this.isAllotted = true;
    }

  
    public void removeOwner() {

        this.ownerName = "No Owner";
        this.isAllotted = false;
    }

   
    public abstract void displayDetails();
}

