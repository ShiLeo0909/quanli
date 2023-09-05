package oop11.bridge.ex;

public class WindowsOS implements  OperatingSystem{
    @Override
    public void startup() {
        System.out.println("booting on windowsnOS");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Loading...." + url);
    }
}
