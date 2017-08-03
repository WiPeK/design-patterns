package functional.visitor;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public interface CarPartVisitor {
    public void visit(Car car);
    public void visit(Engine engine);
    public void visit(Brakes brakes);
    public void visit(Lights lights);
}
