package oop7.ex1_4;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5,5,1,1);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println(movablePoint);

        MovableCircle movableCircle = new MovableCircle(5,5,1,1,3);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        System.out.println(movableCircle);
    }
}
