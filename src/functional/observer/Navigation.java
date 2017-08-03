package functional.observer;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public class Navigation implements Observator {
    private Audi audi;

    public Navigation(Audi audi) {
        this.audi = audi;
    }

    @Override
    public void update() {
        System.out.println("Speed: " + audi.getSpeed());
    }
}
