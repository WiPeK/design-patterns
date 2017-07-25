package structural.proxy;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public class CarShop {

    public static void main(String[] args) {
        Vehicle dealer = new Dealer("Audi 80");
        dealer.turnOn();
        dealer.turnOff();
    }
}
