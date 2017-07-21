package creative.singleton;

/**
 * Anti pattern
 */

public class Singleton {
    private static Singleton instance = null;

    private int value;

    public static synchronized Singleton getInstance() {
        if (instance==null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton(){}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
