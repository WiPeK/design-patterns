package creative.builder;

import javafx.scene.paint.Color;

import java.util.Random;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class AudiBuilder extends CarBuilder {

    private static final String[] models = {"60", "100", "80", "50", "200", "90", "quattro", "coupe",
            "gt", "v8", "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "tt",
            "q3", "q5", "q7", "duo", "r8", "q2", "s2", "s3", "s4", "s5", "s6", "s7",
            "s8", "f103", "rs2", "rs3", "rs4", "rs5", "rs6", "rs7", "tts"};

    private static final String[] types = {"hatchback", "sedan", "avant", "cabriolet", "pickup", "SUV"};

    @Override
    protected void compose() {
        car = new Car();
        car.setColor(Color.BLACK.toString());
        car.setName(models[new Random().nextInt(models.length)]);
        car.setProductionYear(1977 + new Random().nextInt(40));
        car.setType(types[new Random().nextInt(types.length)]);
    }

    @Override
    public Car build() {
        this.compose();
        return car;
    }
}
