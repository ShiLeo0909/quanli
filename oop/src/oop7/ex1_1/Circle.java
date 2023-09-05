package oop7.ex1_1;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String coler, Boolean filled, double radius) {
        super(coler, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius* Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                "radius=" + radius +
                ']';
    }
}
