package structural.bridge;

/**
 * Created by Krzysztof Adamczyk on 19.07.2017.
 */
public class Bridge {

    public static void main(String[] args) {
        Vehicle s8 = new Car("s8", 400, new SType());
        Vehicle rs6 = new Car("rs6", 600, new RSType());
        s8.makeCar();
        rs6.makeCar();
    }
}
