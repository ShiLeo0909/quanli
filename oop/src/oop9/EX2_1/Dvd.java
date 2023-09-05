package oop9.EX2_1;

public class Dvd extends Item{
    private int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "duration=" + duration + super.toString()+
                '}';
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
