package creative.strategy;

/**
 * Created by Krzysztof Adamczyk on 12.07.2017.
 */
public class MotorVinNamingStrategy implements VinNamingStrategy {

    String PREFIX = "M_";

    @Override
    public String addPrefix(String string) {
        return string != null || string.trim().length() > 0 ? PREFIX + string: null;
    }
}
