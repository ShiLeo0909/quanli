package circle1_1;

public class TestCircle {
    public static void main(String[] args) {
       Circle circle = new Circle(6.6);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getColor() + circle.getRadius());
    }
}
