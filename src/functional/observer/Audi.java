package functional.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Krzysztof Adamczyk on 03.08.2017.
 */
public class Audi implements Observed {
    private int speed = 0;
    private List<Observator> observators = new ArrayList<>();

    @Override
    public void addObservator(Observator observator) {
        observators.add(observator);
    }

    @Override
    public void removeObservator(Observator observator) {
        observators.remove(observator);
    }

    @Override
    public void notifyObservators() {
        observators.forEach(Observator::update);
    }

    public void accelerate() {
        this.speed += new Random().nextInt(10);
        this.notifyObservators();
    }

    public void slowDown() {
        this.speed -= new Random().nextInt(10);
        this.speed = this.speed < 0 ? 0 : this.speed;
        notifyObservators();
    }

    public int getSpeed() {
        return speed;
    }
}
