package creative.null_object;

import java.util.Arrays;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class MainNullObject {

    private static final String[] models = {"60", "100", "80", "50", "200", "90", "quattro", "coupe",
            "gt", "v8", "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "tt",
            "q3", "q5", "q7", "duo", "r8", "q2", "s2", "s3", "s4", "s5", "s6", "s7",
            "s8", "f103", "rs2", "rs3", "rs4", "rs5", "rs6", "rs7", "tts"};

    private static CarInterface getAudi(String name) {
        return Arrays.stream(models).anyMatch((i) -> i.equalsIgnoreCase(name)) ? new Audi(name) : new NullCar();
    }

    public static void main(String[] args) {
        System.out.println(getAudi("s9"));
        System.out.println(getAudi("a8"));
    }
}
