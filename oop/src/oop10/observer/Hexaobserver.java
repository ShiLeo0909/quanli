package oop10.observer;

public class Hexaobserver extends  Observer{
    public Hexaobserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String" + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
