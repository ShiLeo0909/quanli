package EX1_1;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
