package EX1_4;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.getColor();
        shape.setColor("Green");
        shape.isFilled();
        shape.setFilled(false);

        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.2 );
        System.out.println(circle2.toString());
        Circle circle = new Circle("Violet" , true , 2.1);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        circle.setRadius(5.0);
        System.out.println(circle.toString());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.0 , 3.0);
        System.out.println( "AREA+" +rectangle2.getArea());
        System.out.println("LENGTH && WIDTH"+rectangle2.getLength() + rectangle2.getWidth());

    }
}
