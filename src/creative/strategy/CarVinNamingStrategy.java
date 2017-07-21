package creative.strategy;

/**
 * Created by Krzysztof Adamczyk on 12.07.2017.
 */
public class CarVinNamingStrategy implements VinNamingStrategy {

    String PREFIX = "C_";

    @Override
    public String addPrefix(String string) {
        return string != null || string.trim().length() > 0 ? PREFIX + string: null;
    }

}
