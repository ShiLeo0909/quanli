package oop7.ex1_1;

public class Rectangle extends Shape {
    protected double length = 1.0;
    protected double width = 1.0;


    public Rectangle() {
    }

    public Rectangle(double length , double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String coler, Boolean filled, double length, double width) {
        super(coler, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    public double getPerimeter(){
        return 2 *(length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
