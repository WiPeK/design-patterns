package functional.chain_of_responsibility;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public class Chain {

    private static AbstractTranslator getChain() {
        AbstractTranslator englishTranslator = new EnglishTranslator("English");
        AbstractTranslator germanTranslator = new GermanTranslator("German");
        AbstractTranslator russianTranslator = new RussianTranslator("Russian");

        englishTranslator.setNextTranslator(germanTranslator);
        germanTranslator.setNextTranslator(russianTranslator);

        return englishTranslator;
    }

    public static void main(String[] args) {
        AbstractTranslator chain = getChain();
        chain.translate("English", "Dzień dobry");
        chain.translate("German", "Dzień dobry");
        chain.translate("Russian", "Dzień dobry");
    }
}
