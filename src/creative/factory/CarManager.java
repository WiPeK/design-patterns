package creative.factory;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class CarManager {

    public static Car getCar(int seatsNumber) {
        return seatsNumber == 1 ? new SportCar() : (seatsNumber == 2 ? new Truck() : new Bus());
    }
}
