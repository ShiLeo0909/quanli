package creational.prototype;

public class ITApp {

    public static void main(String[] args) {
        creational.prototype.Computer computer1 = new creational.prototype.Computer("Window 10", "Word 2013", "BKAV", "Chrome v69", "Skype");
        creational.prototype.Computer computer2 = computer1.clone();
        computer2.setOthers("Skype, Teamviewer, FileZilla Client");

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
