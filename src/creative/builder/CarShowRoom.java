package creative.builder;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class CarShowRoom {

    private CarBuilder carBuilder;

    public CarShowRoom(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        return this.carBuilder.build();
    }
}
