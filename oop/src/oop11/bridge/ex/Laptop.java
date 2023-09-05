package oop11.bridge.ex;

public class Laptop  extends Computer{
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }

    @Override
    public void startup() {
        os.startup();
    }

    @Override
    public void browselntemet(String url) {
        os.loadUrl(url);
    }
}
