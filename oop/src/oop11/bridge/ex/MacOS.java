package oop11.bridge.ex;

public class MacOS  implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("booting on MacOS");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Loading...." + url);
    }

}
