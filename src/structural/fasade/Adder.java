package structural.fasade;

/**
 * Created by Krzysztof Adamczyk on 03.07.2017.
 */
public class Adder {

    private int a;

    private int b;

    private long result;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public long getResult() {
        return result;
    }

    public void count() {
        this.result = this.a + this.b;
    }

}
