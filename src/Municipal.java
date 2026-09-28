public class Municipal {
    private String municipalName;
    private Regions parentRegion; //Linking this municipal to its corresponding Region object
    private int municipalPopulation;

    // Constructor
    public Municipal(String municipalName, Regions parentRegion, int municipalPopulation) {
        this.municipalName = municipalName;
        this.parentRegion = parentRegion;
        this.municipalPopulation = municipalPopulation;
    }

    // 3. These PUBLIC GETTERS will allow other classes to access the data.
     public String getMunicipalName() {
        return this.municipalName;
    }

    public Regions getParentRegion() {
        return this.parentRegion;
    }

    public int getMunicipalPopulation() {
        return this.municipalPopulation;

    }
}
