public class Regions {
private String regionName;
private String climate;
private int totalPopulation;
private double baseRelevance;
private boolean isHighRisk;

// Constructor
 public Regions(String regionName, String climate, int totalPopulation, double baseRelevance)
    {
        this.regionName = regionName;
        this.climate = climate;
        this.totalPopulation = totalPopulation;
        this.baseRelevance = baseRelevance;
        this.isHighRisk = (this.baseRelevance >= 0.15);
    }
  // These PUBLIC GETTERS will allow other classes to access the data.
     public String getRegionName() {
        return this.regionName;
    }
    public String getClimate() {
        return this.climate;
    }
    public int getTotalPopulation() {
        return this.totalPopulation;
    }

    public boolean isHighRisk() {
     return this.isHighRisk;
    }

public void setBaseRelevance(double baseRelevance) {
    this.baseRelevance = baseRelevance;
    this.isHighRisk = (this.baseRelevance >= 0.15);
}
}