package functional.memento;

/**
 * Created by Krzysztof Adamczyk on 02.08.2017.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(this.state);
    }

    public void getFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
