package functional.mediator;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class ChatMediator {
    public static void main(String[] args) {
        Friend x = new Friend("X");
        Friend xx = new Friend("XX");
        Friend xxx = new Friend("XXX");
        Mediator mediator = new RealMediator();
        mediator.registerFriend(x);
        mediator.registerFriend(xx);
        mediator.registerFriend(xxx);

        x.send("XXX", "test");
        xx.send("X", "tedssdffsdfdsst");
        xxx.send("XX", "tedssdffsdfdsst");
    }
}
