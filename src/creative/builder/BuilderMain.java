package creative.builder;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class BuilderMain {

    private static Car[] getCarsFromShowRoom() {
        CarBuilder carBuilder = new AudiBuilder();
        int n = new Random().nextInt(10);
        Car[] cars = new Car[n];
        for(int i = 0; i < n; i++) {
            cars[i] = carBuilder.build();
        }
        return cars;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCarsFromShowRoom()));
    }
}
