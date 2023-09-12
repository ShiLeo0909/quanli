package homework1.bai4;

public class Globular {
    private int x;
    private int y ;
    private int z;
    private int r ;

    public Globular(int x, int y, int z, int r) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getR() {
        return r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Globular{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", r=" + r +
                '}';
    }
}
