package oop1;

public class ComputePII {
    public static void main(String[] args) {
        System.out.println("pi =" + ComputePI(1000));
    }
    public static double ComputePI(int maxDenominator) {
        double sum1 = 0.0;
        double sum2 = 0.0;
        for (int i = 1; i <= maxDenominator; i += 2) {
            if (i % 4 == 1) {
                sum1 += (double) 1 / i;
            } else if (i % 4 == 3) {
                sum2 -= (double) 1 / i;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        return (double) 4 * (sum1 + sum2);
    }
}
