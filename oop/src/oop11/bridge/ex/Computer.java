package oop11.bridge.ex;

public abstract class Computer {
    protected OperatingSystem os;

    public abstract void startup();
    public abstract boolean canMoveComputer();

    public abstract void browselntemet(String url);

    public Computer(OperatingSystem os) {
        this.os = os;
    }
}
