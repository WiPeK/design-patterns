package functional.iterator;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class Audi {
    private String name;

    public Audi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "name='" + name + '\'' +
                '}';
    }
}
