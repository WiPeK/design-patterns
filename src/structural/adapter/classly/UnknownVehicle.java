package structural.adapter.classly;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class UnknownVehicle implements Vehicle {
    @Override
    public void driveOnFourWheel() {
        System.out.println("Drive on 3 wheels");
    }
}
