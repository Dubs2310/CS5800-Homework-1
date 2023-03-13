public class Ship {
    private String name;
    private String yearBuilt;

    public Ship() {
        name = "";
        yearBuilt = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void printShipInfo() {
        System.out.println(name + ", " + yearBuilt);
    }
}
