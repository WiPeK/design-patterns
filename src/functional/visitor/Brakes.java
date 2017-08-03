package functional.visitor;

import java.util.Random;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public class Brakes implements CarPart {
    private boolean status = new Random().nextBoolean();

    @Override
    public void accept(CarPartVisitor carPartVisitor) {
        carPartVisitor.visit(this);
    }

    @Override
    public void repair() {
        this.status = true;
    }

    public boolean isStatus() {
        return status;
    }
}
