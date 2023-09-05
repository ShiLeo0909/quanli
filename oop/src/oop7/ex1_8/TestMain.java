package oop7.ex1_8;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(5,5,1,1);
        MovablePoint m2 = new MovablePoint(4,4,1,1);

        MovableRectangle movableRectangle = new MovableRectangle(5,5,4,4,1,1);
        System.out.println(movableRectangle);
        movableRectangle.moveUp();
        System.out.println(movableRectangle);
    }
}
