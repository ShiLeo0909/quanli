package oop11.bridge.ex;

public class Client {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new WindowsOS();
        OperatingSystem operatingSystem1 = new MacOS();

        Computer computer = new Laptop(operatingSystem1);
        Computer computer1 = new Laptop(operatingSystem);
        Computer computer2 = new PC(operatingSystem);
        Computer computer3 = new PC(operatingSystem1);

    }
}
