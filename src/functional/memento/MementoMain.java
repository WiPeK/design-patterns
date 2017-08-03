package functional.memento;

/**
 * Created by Krzysztof Adamczyk on 02.08.2017.
 */
public class MementoMain {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("sdfsdfsdf");
        careTaker.add(originator.saveToMemento());
        originator.setState("aaaaaaaaaaaaa");
        careTaker.add(originator.saveToMemento());
        originator.setState("111111111111");
        careTaker.add(originator.saveToMemento());
        originator.setState("222222222222222");
        careTaker.add(originator.saveToMemento());
        originator.setState("3333333333333");
        careTaker.add(originator.saveToMemento());
        System.out.println(careTaker.getLast());
        careTaker.removeLast();
        System.out.println(careTaker.getLast());
        careTaker.removeLast();
        System.out.println(careTaker.getLast());
        careTaker.removeLast();
        System.out.println(careTaker.getLast());
        careTaker.removeLast();
        System.out.println(careTaker.getLast());
        careTaker.removeLast();
    }
}
