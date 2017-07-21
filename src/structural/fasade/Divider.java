package structural.fasade;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class Divider {

    private int a;

    private int b;

    private long result;

    public Divider(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public long getResult() {
        return result;
    }

    public void count() {
        this.result = this.a / this.b;
    }
}
