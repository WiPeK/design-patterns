package creative.inner_static_builder;

import javafx.scene.paint.Color;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class ISBMain {

    private static final String[] models = {"60", "100", "80", "50", "200", "90", "quattro", "coupe",
            "gt", "v8", "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "tt",
            "q3", "q5", "q7", "duo", "r8", "q2", "s2", "s3", "s4", "s5", "s6", "s7",
            "s8", "f103", "rs2", "rs3", "rs4", "rs5", "rs6", "rs7", "tts"};

    private static final String[] types = {"hatchback", "sedan", "avant", "cabriolet", "pickup", "SUV"};

    private static Car[] getCarsFromShowRoom() {
        int n = new Random().nextInt(10);
        Car[] cars = new Car[n];
        for(int i = 0; i < n; i++) {
            cars[i] = new Car.Builder(models[new Random().nextInt(models.length)])
                        .setColor(Color.BLACK.toString())
                        .setProductionYear(1977 + new Random().nextInt(40))
                        .setType(types[new Random().nextInt(types.length)])
                        .build();
        }
        return cars;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCarsFromShowRoom()));
    }
}
