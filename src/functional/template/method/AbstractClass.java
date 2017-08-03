package functional.template.method;

/**
 * Created by Krzysztof Adamczyk on 02.08.2017.
 */
public abstract class AbstractClass {

    protected int a,b;
    protected double result;

    protected abstract void initialize();

    protected abstract void clean();

    protected abstract void doOperation();

    public final void templateMethod() {
        this.initialize();
        this.doOperation();
        this.clean();
    }

    @Override
    public String toString() {
        return "AbstractClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
