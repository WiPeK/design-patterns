package functional.command;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class TurnOnCommand implements Command {
    private Audi audi;

    public TurnOnCommand(Audi audi) {
        this.audi = audi;
    }

    @Override
    public void execute() {
        this.audi.turnOn();
    }
}
