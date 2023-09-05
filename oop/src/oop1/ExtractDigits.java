package oop1;

public class ExtractDigits {
    public static void main(String[] args) {
        extractDigits();
    }
    public static void extractDigits() {
        int n = 12345;
        while (n > 0) {
            int k = n % 10;
            n /= 10;
            System.out.print(k + " ");
        }
    }
}
