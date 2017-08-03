package functional.iterator;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class AudiIterator {
    private static final String[] models = {"60", "100", "80", "50", "200", "90", "quattro", "coupe",
            "gt", "v8", "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "tt",
            "q3", "q5", "q7", "duo", "r8", "q2", "s2", "s3", "s4", "s5", "s6", "s7",
            "s8", "f103", "rs2", "rs3", "rs4", "rs5", "rs6", "rs7", "tts"};

    public static void main(String[] args) {
        AudiStore audiStore = new AudiStore();
        Arrays.asList(models).forEach(i -> audiStore.add(new Audi(i)));
        Collection audiList = audiStore.getData();
        audiList.forEach(System.out::println);
        System.out.println(audiList.size());
        audiList.clear();
        audiList = audiStore.getData();
        System.out.println(audiList.size());
    }
}
