package functional.observer;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public interface Observed {
    public void addObservator(Observator observator);
    public void removeObservator(Observator observator);
    public void notifyObservators();
}
