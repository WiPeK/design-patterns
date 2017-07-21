package structural.composite;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Krzysztof Adamczyk on 19.07.2017.
 */
public class Army extends Soldier {

    Set<Soldier> soldiers = new HashSet<>();

    @Override
    public void fight() {
        soldiers.forEach(Soldier::fight);
    }

    public void add(Soldier soldier) {
        this.soldiers.add(soldier);
    }
}
