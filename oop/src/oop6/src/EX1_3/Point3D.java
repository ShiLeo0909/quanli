package EX1_3;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;

    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        super.setX(x);
        super.setY(y);
    }

    public float[] getXYZ() {
        float[] getXYZ = new float[3];
        getXYZ[0] = getX();
        getXYZ[1] = getY();
        getXYZ[2] = getZ();
        return getXYZ;
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + "," + getZ() + ")";
    }
}
