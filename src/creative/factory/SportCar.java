package creative.factory;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class SportCar implements Car {

    private double mass;

    private int seatsNumber;

    private int maxSpeed;

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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "mass=" + mass +
                ", seatsNumber=" + seatsNumber +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
