package creative.factory;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class Truck implements Car {

    private double mass;

    private int seatsNumber;

    private double capacity;

    @Override
    public double getMass() {
        return this.mass;
    }

    @Override
    public int getSeatsNumber() {
        return this.seatsNumber;
    }

    @Override
    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setWheelsQuantity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "mass=" + mass +
                ", seatsNumber=" + seatsNumber +
                ", capacity=" + capacity +
                '}';
    }
}
