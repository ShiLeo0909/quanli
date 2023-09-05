package oop7.ex1_1;

public class TestMain {
    public static void main(String[] args) {
      Shape shape1 = new Circle("red" , false , 5.5);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.isFilled());
        System.out.println(shape1.getColer());

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

    }
}
