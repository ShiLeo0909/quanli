package oop11.builder;

import java.util.ArrayList;
import java.util.List;

public class Manual {
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
        return "Manual{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }
}
