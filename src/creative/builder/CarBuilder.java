package creative.builder;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public abstract class CarBuilder {

    protected Car car;

    protected abstract void compose();

    public Car build() {
        return car;
    }
}
