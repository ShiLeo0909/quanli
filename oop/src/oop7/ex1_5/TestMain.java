package oop7.ex1_5;


public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.3);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(5.5);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
    }
}
