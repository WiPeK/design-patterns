package structural.composite;

/**
 * Created by Krzysztof Adamczyk on 19.07.2017.
 */
public class SingleSoldier extends Soldier {

    private int id;

    public SingleSoldier(int id) {
        this.id = id;
    }

    @Override
    public void fight() {
        System.out.println("I fight, my id: " + this.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleSoldier)) return false;

        SingleSoldier that = (SingleSoldier) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
