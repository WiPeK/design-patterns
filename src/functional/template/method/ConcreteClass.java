package functional.template.method;

/**
 * Created by Krzysztof Adamczyk on 02.08.2017.
 */
public class ConcreteClass extends AbstractClass {
    @Override
    protected void initialize() {
        this.a = 10;
        this.b = 20;
        System.out.println(this);
    }

    @Override
    protected void clean() {
        this.a = 0;
        this.b = 0;
        System.out.println(this);
    }

    @Override
    protected void doOperation() {
        this.result = a + b;
        System.out.println(result);
    }
}
