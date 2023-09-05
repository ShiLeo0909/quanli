package HinhTron;

import HinhTron.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle sc = new Circle(2);
        System.out.println(sc.getArea());
        System.out.println(sc.getCircumference());
        System.out.println(sc.toString());
    }
}
