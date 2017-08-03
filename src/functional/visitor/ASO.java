package functional.visitor;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public class ASO {
    public static void main(String[] args) {
        CarPart carPart = new Car();
        carPart.accept(new PartsVisitor());
    }
}
