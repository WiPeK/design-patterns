package functional.command;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class Audi implements structural.proxy.Vehicle{
    @Override
    public void turnOn() {
        System.out.println("Audi turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Audi turn off");
    }
}
