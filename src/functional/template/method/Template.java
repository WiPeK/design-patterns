package functional.template.method;

/**
 * Created by Krzysztof Adamczyk on 02.08.2017.
 */
public class Template {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
