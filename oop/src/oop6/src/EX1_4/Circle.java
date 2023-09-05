package EX1_4;

public class Circle  extends Shape{
    private double radius;

    public Circle(){

    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius *radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color =" + getColor() + ",filled=" + isFilled()+"],"
                 +"radius=" + radius +
                ']';
    }
}
