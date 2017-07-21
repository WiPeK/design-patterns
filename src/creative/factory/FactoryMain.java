package creative.factory;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class FactoryMain {

    public static void main(String[] args) {
        int seatsNumber = 1;
        Car car = CarManager.getCar(seatsNumber);
        car.setMass(1200.4);
        car.setSeatsNumber(seatsNumber);
        ((SportCar)car).setMaxSpeed(450);
        System.out.println(car);
        seatsNumber = 2;
        car = CarManager.getCar(seatsNumber);
        car.setMass(11200.4);
        car.setSeatsNumber(seatsNumber);
        ((Truck)car).setWheelsQuantity(18);
        System.out.println(car);
        seatsNumber = 30;
        car = CarManager.getCar(seatsNumber);
        car.setMass(6200.4);
        car.setSeatsNumber(seatsNumber);
        ((Bus)car).setWheelsQuantity(12);
        System.out.println(car);
    }
}
