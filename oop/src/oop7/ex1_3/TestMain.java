package oop7.ex1_3;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 5, 1, 1);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println(movablePoint);
    }
}
