package structural.adapter.classly;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class Main {
    private static Vehicle vehicle = new UnknownVehicle();

    public static void main(String[] args) {
        vehicle.driveOnFourWheel();
        vehicle = new VehicleToMotorAdapter();
        vehicle.driveOnFourWheel();
    }
}
