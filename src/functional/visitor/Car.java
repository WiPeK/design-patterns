package functional.visitor;

import java.util.Arrays;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public class Car implements CarPart {

    private boolean status = true;

    private CarPart[] carParts = {new Engine(), new Brakes(), new Lights()};

    @Override
    public void accept(CarPartVisitor carPartVisitor) {
        Arrays.asList(carParts).forEach(i -> i.accept(carPartVisitor));
        carPartVisitor.visit(this);
    }

    @Override
    public void repair() {
        Arrays.asList(carParts).forEach(CarPart::repair);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public CarPart[] getCarParts() {
        return carParts;
    }
}
