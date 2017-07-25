package functional.chain_of_responsibility;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public class GermanTranslator extends AbstractTranslator {
    public GermanTranslator(String country) {
        this.country = country;
    }

    @Override
    protected void translateMessage(String message) {
        System.out.println("Guten morgen");
    }
}
