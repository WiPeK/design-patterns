package creative.prototype;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class Audi extends Vehicle {
    private String name;

    public Audi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "name='" + name + '\'' +
                '}';
    }
}
