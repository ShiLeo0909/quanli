package oop1;

public class FIBONACI {
    public static void main(String[] args) {
        Fibonaci();
    }
    public static void Fibonaci() {
        int count = 3;
        int n = 0;
        int n1 = 1;
        int n2 = 1;
        int nMax = 20;
        int sum = 0;
        double average = 0.0;
        System.out.print(n1 + " ");
        System.out.println("The first " + nMax + "Fibonaci numbers are:");
        while (count <= nMax) {
            n = n1 + n2;
            n1 = n2;
            n2 = n;
            count++;
            sum += n;
            System.out.print(n + " ");
        }
        System.out.println("Average = " + (double) (sum + 2) / (20));
    }
}
