package oop1;

public class CircleComputation {
    public static void main(String[] args) {
        circleComputation(5.5);
    }
    public static void circleComputation(double radius) {
        double diameter = 2 * radius;
        System.out.printf( "Diameter ="+ diameter);
        double area = Math.PI * radius * radius;
        System.out.printf( "Area =" + area);
        double circumference = 2 * Math.PI * radius;
        System.out.printf( "Circumference" + circumference);
    }
}
