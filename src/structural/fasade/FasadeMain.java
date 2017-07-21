package structural.fasade;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class FasadeMain {

    public static void main(String[] args) {
        int a = 10, b = 2;
        Adder adder = new Adder();
        adder.setA(a);
        adder.setB(b);
        adder.count();
        System.out.println("Adding: " + a + " + " + b + " = " + adder.getResult());
        Substractor substractor = new Substractor(a, b);
        substractor.count();
        System.out.println("Substracting: " + a + " - " + b + " = " + substractor.getResult());
        Multiplier multiplier = new Multiplier(a, b);
        multiplier.count();
        System.out.println("Multiply: " + a + " * " + b + " = " + multiplier.getResult());
        Divider divider = new Divider(a, b);
        divider.count();
        System.out.println("Dividing: " + a + " / " + b + " = " + divider.getResult());
    }
}
