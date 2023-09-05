package EX1_5;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        ResizableCircle r = new ResizableCircle(3.9);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        r.resize(50);
    }
}
