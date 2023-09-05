package oop7.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Rectangle r1 = new Rectangle(2.2 , 2.2);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
