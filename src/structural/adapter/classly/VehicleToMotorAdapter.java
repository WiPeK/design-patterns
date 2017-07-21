package structural.adapter.classly;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class VehicleToMotorAdapter extends Motor implements Vehicle {
    @Override
    public void driveOnFourWheel() {
        super.driveOn2Wheel();
    }
}
