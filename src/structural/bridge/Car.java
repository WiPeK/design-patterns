package structural.bridge;

/**
 * Created by Krzysztof Adamczyk on 19.07.2017.
 */
public class Car extends Vehicle {
    private String name;
    private int hp;

    public Car(String name, int hp, Audi audi) {
        super(audi);
        this.name = name;
        this.hp = hp;
    }

    @Override
    public void makeCar() {
        this.audi.produce(name, hp);
    }
}
