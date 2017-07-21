package structural.bridge;

/**
 * Created by Krzysztof Adamczyk on 19.07.2017.
 */
public abstract class Vehicle {
    protected Audi audi;

    protected Vehicle(Audi audi) {
        this.audi = audi;
    }

    public abstract void makeCar();
}
