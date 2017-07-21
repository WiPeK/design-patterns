package creative.prototype;

/**
 * Created by Krzysztof Adamczyk on 13.07.2017.
 */
public class Vehicle implements Cloneable {

    public Object clone() {
        try {
            return super.clone();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
