package creative.null_object;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class NullCar implements CarInterface {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String toString() {
        return "NullCar{}";
    }
}
