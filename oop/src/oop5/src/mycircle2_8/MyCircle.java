package mycircle2_8;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle() {
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int [] getCenterXY(){
        int [] getCeterXY = new int [2];
        getCeterXY[0] = getCenterX();
        getCeterXY[1] = getCenterY();
        return getCeterXY;
    }
    public void setCenterXY(int x , int y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "center=" + center +
                ", radius=" + radius +
                ']';
    }
    public double getArea(){
        return  Math.PI * Math.pow(radius , 2);
    }
    public double getCircumference(){
        return 2*Math.PI * radius;
    }
    public double distance( MyCircle another){
        return center.distance(another.center);
    }
}