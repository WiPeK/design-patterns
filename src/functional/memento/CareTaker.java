package functional.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Adamczyk on 02.08.2017.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public Memento getLast() {
        return mementoList.get(mementoList.size()-1);
    }

    public void removeLast() {
        this.mementoList.remove(mementoList.size()-1);
    }
}
