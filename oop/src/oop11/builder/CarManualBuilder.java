package oop11.builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    public Builder reset() {
        this.manual = new Manual();
        return this;
    }

    public Builder setSeats(int seats) {
        this.manual.setSeats(seats);
        return this;
    }

    public Builder setEngine(String engine) {
        this.manual.setEngine(engine);
        return this;
    }

    public Builder setTripComputer(boolean tripComputer) {
        this.manual.setTripComputer(tripComputer);
        return this;
    }

    public Builder setGPS(boolean GPS) {
        this.manual.setGPS(GPS);
        return this;
    }
    public Manual getResult() {
        return new Manual();
    }
}
