package functional.command;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class Remote {
    public static void main(String[] args) {
        AudiControl audiControl = new AudiControl();
        Audi audi = new Audi();
        Command turnOn = new TurnOnCommand(audi);
        Command turnOff = new TurnOffCommand(audi);

        audiControl.setCommand(turnOn);
        audiControl.run();

        audiControl.setCommand(turnOff);
        audiControl.run();
    }
}
