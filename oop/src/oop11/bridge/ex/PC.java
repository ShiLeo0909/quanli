package oop11.bridge.ex;

public class PC extends Computer{
    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        os.startup();
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }

    @Override
    public void browselntemet(String url) {
        os.loadUrl(url);
    }
}
