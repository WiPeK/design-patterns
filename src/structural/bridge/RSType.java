package structural.bridge;

/**
 * Created by Krzysztof Adamczyk on 19.07.2017.
 */
public class RSType implements Audi {
    @Override
    public void produce(String name, int hp) {
        System.out.println("Produce Audi rs: " + name + " hp: " + hp);
    }
}
