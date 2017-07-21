package creative.strategy;

/**
 * Created by Krzysztof Adamczyk on 12.07.2017.
 */
public class Vehicle {

    private String vin;

    private VinNamingStrategy vinNamingStrategy;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = this.vinNamingStrategy != null ? vinNamingStrategy.addPrefix(vin) : vin;
    }

    public VinNamingStrategy getVinNamingStrategy() {
        return vinNamingStrategy;
    }

    public void setVinNamingStrategy(VinNamingStrategy vinNamingStrategy) {
        this.vinNamingStrategy = vinNamingStrategy;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", vinNamingStrategy=" + vinNamingStrategy +
                '}';
    }
}
