package functional.mediator;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class Friend {
    private Mediator mediator;
    private String id;

    public Friend(String id) {
        this.id = id;
    }

    public void registerMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String id, String message) {
        this.mediator.send(id, message);
    }

    public void receive(String message) {
        System.out.println(this.id + " " + message);
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend)) return false;

        Friend friend = (Friend) o;

        if (mediator != null ? !mediator.equals(friend.mediator) : friend.mediator != null) return false;
        return id != null ? id.equals(friend.id) : friend.id == null;
    }

    @Override
    public int hashCode() {
        int result = mediator != null ? mediator.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
