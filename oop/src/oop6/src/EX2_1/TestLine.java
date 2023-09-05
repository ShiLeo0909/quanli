package EX2_1;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line( 0,0,3,4);
        System.out.println(line1.toString());
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }
}
