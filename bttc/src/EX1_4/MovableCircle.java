package EX1_4;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.setY(center.getY() - center.getySpeed());
    }

    public void moveDown() {
        center.setY(center.getY() + center.getySpeed());
    }

    public void moveLeft() {
        center.setX(center.getX() - center.getxSpeed());
    }

    public void moveRight() {
        center.setX(center.getX() - center.getxSpeed());
    }

    @Override
    public String toString() {
        return "(" + center.getX() + "," + center.getY() + "),speed = (" +
                center.getxSpeed() + ", " + center.getySpeed() + "),radius ="
                + radius +
                '}';
    }
}
