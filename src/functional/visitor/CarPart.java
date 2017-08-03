package functional.visitor;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public interface CarPart {
    public void accept(CarPartVisitor carPartVisitor);
    public void repair();
    public boolean isStatus();
}
