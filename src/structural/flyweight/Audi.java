package structural.flyweight;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public class Audi implements Vehicle {
    private String name;
    private int hp;

    public Audi(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void showProperties() {
        System.out.println(this.name + " " + this.hp);
    }
}
