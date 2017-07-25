package structural.proxy;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public class Dealer implements Vehicle {
    private Audi audi;
    private String name;

    public Dealer(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        audi = audi == null ? new Audi(this.name) : this.audi;
        audi.turnOn();
    }

    @Override
    public void turnOff() {
        audi.turnOff();
    }
}
