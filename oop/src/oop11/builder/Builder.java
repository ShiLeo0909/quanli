package oop11.builder;

public interface Builder {
    Builder reset();
    Builder setSeats(int seats);
    Builder setEngine(String engine);
    Builder setTripComputer(boolean tripComputer);
    Builder setGPS(boolean GPS);

}
