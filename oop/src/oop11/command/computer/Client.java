package oop11.command.computer;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Command restart = new RestartCommand(computer);
        Command shutDown = new ShutDownCommand(computer);

        Switch s = new Switch();

        s.storeAndExecute(restart);
        s.storeAndExecute(shutDown);
    }
}
