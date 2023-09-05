package mycircle2_8;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] getXY = new int[2];
        getXY[0] = x;
        getXY[1] = y;
        return getXY;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +
                x +
                ", " + y +
                ')';
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y ,2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(this.x - another.getX() , 2) + Math.pow(this.y - another.getY(),2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y, 2));
    }
}