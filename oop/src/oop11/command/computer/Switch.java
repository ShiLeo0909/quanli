package oop11.command.computer;

import oop11.command.computer.Command;

public class Switch {
    public Switch() {
    }
    public void storeAndExecute(Command c){
        c.execute();
    }
}
