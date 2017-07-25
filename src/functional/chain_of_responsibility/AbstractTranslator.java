package functional.chain_of_responsibility;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public abstract class AbstractTranslator {
    protected String country;

    protected AbstractTranslator nextTranslator;

    public void setNextTranslator(AbstractTranslator abstractTranslator) {
        this.nextTranslator = abstractTranslator;
    }

    public void translate(String country, String message) {
        if (this.country.equalsIgnoreCase(country)) {
            this.translateMessage(message);
        }
        if (this.nextTranslator != null) {
            this.nextTranslator.translate(country, message);
        }
    }

    abstract protected void translateMessage(String message);
}
