package creative.state;

/**
 * Created by Krzysztof Adamczyk on 06.07.2017.
 */
public class MainState {

    public static void main(String[] args) {
        Car audi = new Car.Builder("Audi")
                    .setColor("black")
                    .setProductionYear(1999)
                    .setType("avant")
                    .state(new CarAvailable())
                    .build();
        Car alfa = new Car.Builder("Alfa")
                .setColor("red")
                .setProductionYear(2014)
                .setType("hatchback")
                .state(new CarDamaged())
                .build();

        System.out.println(audi);
        audi.reportStatus();
        System.out.println(alfa);
        alfa.reportStatus();
    }
}
