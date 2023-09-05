package oop11.command.computer;

import oop11.command.computer.Command;
import oop11.command.computer.Computer;

public class ShutDownCommand implements Command {
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.shutDown();
    }
}
