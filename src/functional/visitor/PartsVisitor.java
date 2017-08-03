package functional.visitor;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public class PartsVisitor implements CarPartVisitor {
    @Override
    public void visit(Car car) {
        boolean status = true;
        for (CarPart carPart : car.getCarParts()) {
            status = status && carPart.isStatus();
        }
        car.setStatus(status);
        System.out.println("Car: " + car.isStatus());
        if (!car.isStatus()) {
            car.repair();
        }
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Engine: " + engine.isStatus());
        if (!engine.isStatus()) {
            engine.repair();
        }
    }

    @Override
    public void visit(Brakes brakes) {
        System.out.println("Brakes: " + brakes.isStatus());
        if (!brakes.isStatus()) {
            brakes.repair();
        }
    }

    @Override
    public void visit(Lights lights) {
        System.out.println("Lights: " + lights.isStatus());
        if (!lights.isStatus()) {
            lights.repair();
        }
    }
}
