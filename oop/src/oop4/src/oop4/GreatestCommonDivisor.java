package oop4;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
