package creative.factory;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class Bus implements Car {

    private double mass;

    private int seatsNumber;

    private int wheelsQuantity;

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

    public int getWheelsQuantity() {
        return wheelsQuantity;
    }

    public void setWheelsQuantity(int wheelsQuantity) {
        this.wheelsQuantity = wheelsQuantity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "mass=" + mass +
                ", seatsNumber=" + seatsNumber +
                ", wheelsQuantity=" + wheelsQuantity +
                '}';
    }
}
