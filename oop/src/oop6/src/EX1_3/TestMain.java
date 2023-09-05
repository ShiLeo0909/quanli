package EX1_3;

public class TestMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D( 5.6f ,5.4f);
        System.out.println(point2D.toString());
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        point2D.setX(7.5f);
        point2D.setY(6.9f);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(2.3f , 4.4f , 5.5f);
        System.out.println(point3D .toString());
        point3D.setZ(6.6f);
        System.out.println(point3D);
        System.out.println(point3D.getXYZ());
    }
}
