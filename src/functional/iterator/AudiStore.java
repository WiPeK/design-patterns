package functional.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class AudiStore implements Store {
    private List<Audi> data = new ArrayList<>();

    @Override
    public void add(Object value) {
        data.add((Audi)value);
    }

    @Override
    public List getData() {
        return data;
    }
}
