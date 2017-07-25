package functional.command;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class AudiControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        this.command.execute();
    }
}
