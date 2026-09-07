public class Regions {
public String regionName;
public String climate;
public int totalPopulation;
public double baseRelevance;
public boolean isHighRisk;

// Constructor
 public Regions(String regionName, String climate, int totalPopulation, double baseRelevance, boolean isHighRisk
 ) {
        this.regionName = regionName;
        this.climate = climate;
        this.totalPopulation = totalPopulation;
        this.baseRelevance = baseRelevance;
        this.isHighRisk = isHighRisk;
 }
}