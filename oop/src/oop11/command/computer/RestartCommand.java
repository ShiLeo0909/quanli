package oop11.command.computer;

import oop11.command.computer.Command;
import oop11.command.computer.Computer;

public class RestartCommand implements Command {
    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.restart();
    }
}
