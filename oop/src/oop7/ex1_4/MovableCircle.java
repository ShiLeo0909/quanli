package oop7.ex1_4;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x ,int y , int xSpeed , int ySpeed , int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x , y , xSpeed , ySpeed);
    }

    @Override
    public String toString() {
        return center.toString() + ",radius =" + radius;

    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    } public void moveLeft(){
        center.moveLeft();
    } public void moveRight(){
        center.moveRight();
    }
}
