package functional.observer;

import java.util.Random;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public class NavigationInCar {

    public static void main(String[] args) {
        Audi audi = new Audi();
        Observator observator = new Navigation(audi);
        Observator observator2 = new Navigation(audi);
        Observator observator3 = new Navigation(audi);

        audi.addObservator(observator);
        audi.addObservator(observator2);
        audi.addObservator(observator3);

        Random generator = new Random();

        for (int i = 0; i < 20; i++) {
            if (generator.nextBoolean()) {
                audi.accelerate();
            } else {
                audi.slowDown();
            }
            try {
                Thread.sleep(generator.nextInt(1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
