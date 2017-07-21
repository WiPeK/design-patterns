package structural.composite;

/**
 * Created by Krzysztof Adamczyk on 19.07.2017.
 */
public class War {

    public static void main(String[] args) {
        Army army = new Army();
        for (int i = 0; i < 10; i++) {
            army.add(new SingleSoldier(i));
        }
        army.fight();
    }
}
