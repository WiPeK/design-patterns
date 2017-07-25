package functional.chain_of_responsibility;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public class RussianTranslator extends AbstractTranslator {
    public RussianTranslator(String country) {
        this.country = country;
    }

    @Override
    protected void translateMessage(String message) {
        System.out.println("доброе утро");
    }
}
