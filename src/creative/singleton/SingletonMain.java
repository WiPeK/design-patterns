package creative.singleton;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setValue(666);
        System.out.println(singleton.getValue());
        Singleton test = Singleton.getInstance();
        System.out.println(test.getValue());
    }
}
