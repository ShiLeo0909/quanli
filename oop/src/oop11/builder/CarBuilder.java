package oop11.builder;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    public Builder reset() {
        this.car = new Car();
        return this;
    }

    public Builder setSeats(int seats) {
        this.car.setSeats(seats);
        return this;
    }

    public Builder setEngine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    public Builder setTripComputer(boolean tripComputer) {
        this.car.setTripComputer(tripComputer);
        return this;
    }

    public Builder setGPS(boolean GPS) {
        this.car.setGPS(GPS);
        return this;
    }
    public Car getResult(){
        return new Car();
    }
}
