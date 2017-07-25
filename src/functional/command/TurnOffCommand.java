package functional.command;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class TurnOffCommand implements Command {
    private Audi audi;

    public TurnOffCommand(Audi audi) {
        this.audi = audi;
    }

    @Override
    public void execute() {
        this.audi.turnOff();
    }
}
