package mytriangle2_9;

public class TestMain {
    public class TestTriangle {
        public static void main(String[] args) {
            MyPoint v1 = new MyPoint(1, 2);
            MyPoint v2 = new MyPoint(3, 4);
            MyPoint v3 = new MyPoint(5, 6);
            MyTriangle triangle1 = new MyTriangle(v1, v2, v3);
            System.out.println(triangle1);
            System.out.println("perimeter: " + triangle1.getPerimeter());
            System.out.println("type: " + triangle1.getType());

            MyTriangle triangle2 = new MyTriangle(0, 4, -3, 0, 3, 0);
            System.out.println(triangle2);
            System.out.println("perimeter: " + triangle2.getPerimeter());
            System.out.println("type: " + triangle2.getType());
        }
    }
}
