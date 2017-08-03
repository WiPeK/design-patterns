package functional.iterator;

import java.util.List;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public interface Store {
    public void add(Object value);
    public List getData();
}
