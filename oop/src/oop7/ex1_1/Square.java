package oop7.ex1_1;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(String coler, Boolean filled, double side) {
        super(coler, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        super.setLength(side);
    }

    public double getSide() {
        return super.getLength();
    }

    @Override
    public String toString() {
        return "Square[ " + super.toString() + "]";
    }
}
