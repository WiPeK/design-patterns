package functional.mediator;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public interface Mediator {
    public void send(String id, String message);
    public void registerFriend(Friend friend);
}
