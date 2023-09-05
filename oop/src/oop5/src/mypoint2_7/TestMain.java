package mypoint2_7;

public class TestMain {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(1, 1);
        MyPoint end = new MyPoint(4, 3);
        MyLine line1 = new MyLine(begin, end);
        System.out.println(line1);
        line1.setBeginXY(2, 4);
        System.out.println(line1);
        line1.setEndXY(2, 5);
        System.out.println(line1);
        System.out.println("length is: " + line1.getLength());
        System.out.println("gradient is: " + line1.getGredient());

    }
}
