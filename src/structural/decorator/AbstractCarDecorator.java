package structural.decorator;

/**
 * Created by Krzysztof Adamczyk on 06.07.2017.
 */
public abstract class AbstractCarDecorator implements Vehicle {

    protected Car car;

    public AbstractCarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public Car getCar() {
        return car;
    }
}
