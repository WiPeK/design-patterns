package creative.null_object;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class Audi implements CarInterface {

    private String name;

    public Audi(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "name='" + name + '\'' +
                '}';
    }
}
