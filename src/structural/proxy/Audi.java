package structural.proxy;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public class Audi implements Vehicle {
    private String name;

    public Audi(String name) {
        this.name = name;
        this.tankToFull();
    }

    private void tankToFull() {
        System.out.println("Tank to full " + this.name);
    }

    @Override
    public void turnOn() {
        System.out.println(this.name + " turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(this.name + " turning off");
    }
}
