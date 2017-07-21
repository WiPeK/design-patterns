package creative.prototype;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class VehicleCreator {

    private Vehicle vehicle;

    public VehicleCreator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle createVehicle() {
        return (Vehicle)this.vehicle.clone();
    }

    public static void main(String[] args) {
        Vehicle tmpVehicle;
        Vehicle veh = new Audi("80");
        VehicleCreator vehicleCreator = new VehicleCreator(veh);
        for (int i = 0; i < 10; i++) {
            tmpVehicle = vehicleCreator.createVehicle();
            System.out.println(tmpVehicle);
        }
    }
}
