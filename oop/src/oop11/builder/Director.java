package oop11.builder;

public class Director {

    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(7);
        builder.setEngine("V6");
        builder.setTripComputer(false);
        builder.setGPS(true);
    }

    public void makeSportsCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine("Leo")
                .setTripComputer(true)
                .setGPS(true);
    }

}
