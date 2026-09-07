public class Municipal {
    public String municipalName;
    public Regions parentRegion; //Linking this municipal to its corresponding Region object
    public int municipalPopulation;

    // Constructor
    public Municipal(String municipalName, Regions parentRegion, int municipalPopulation) {
        this.municipalName = municipalName;
        this.parentRegion = parentRegion;
        this.municipalPopulation = municipalPopulation;

    }
}
