package EX2_2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(2.2 , " red");
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(6);
        cylinder.setBase(circle);
        System.out.println(cylinder.getBase());
        System.out.println(cylinder.toString());
    }
}
