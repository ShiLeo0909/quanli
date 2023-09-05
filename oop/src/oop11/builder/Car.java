package oop11.builder;

public class Car {
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean GPS;


    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }
}
