package functional.state;

/**
 * Created by Krzysztof Adamczyk on 06.07.2017.
 */
public class CarAvailable implements CarState {
    @Override
    public void reportState(Car car) {
        System.out.println("Car works");
    }
}
