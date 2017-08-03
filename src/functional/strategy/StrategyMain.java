package functional.strategy;

/**
 * Created by Krzysztof Adamczyk on 12.07.2017.
 */
public class StrategyMain {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setVinNamingStrategy(new CarVinNamingStrategy());
        car.setVin("dgfsdgdfgdfgdf");
        System.out.println(car);

        Vehicle motor = new Vehicle();
        motor.setVinNamingStrategy(new MotorVinNamingStrategy());
        motor.setVin("fer5t4fd34");
        System.out.println(motor);
    }
}
