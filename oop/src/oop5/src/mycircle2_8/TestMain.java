package mycircle2_8;

public class TestMain {
    public static void main(String[] args) {
        MyPoint another = new MyPoint(2, 4 );
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle1 = new MyCircle(center, 2);
        System.out.println(circle1);

        circle1.setRadius(4);
        System.out.println("radius is: " + circle1.getRadius());
        circle1.setCenter(new MyPoint(2, 2));
        System.out.println(center);

        circle1.setCenterX(3);
        System.out.println("center x: " + circle1.getCenterX());
        circle1.setCenterY(4);
        System.out.println("center y: " + circle1.getCenterY());
        System.out.println(circle1);

        circle1.setCenterXY(5, 6);
        System.out.println(circle1);

        System.out.println("area: " + circle1.getArea());
        System.out.println("circumference: " + circle1.getCircumference());

        System.out.println("distance: " + center.distance(another));

    }
}
