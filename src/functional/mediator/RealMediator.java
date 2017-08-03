package functional.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class RealMediator implements Mediator {
    private Map<String, Friend> friends = new HashMap<>();

    @Override
    public void registerFriend(Friend friend) {
        friend.registerMediator(this);
        friends.put(friend.getId(), friend);
    }

    @Override
    public void send(String id, String message) {
        friends.get(id).receive(message);
    }
}
