package oop1;

import java.util.Scanner;

public class HarmonicSumm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter maxDenominator");
        int maxDenominator = sc.nextInt();
        HarmonicSum(maxDenominator);
    }
    public static double HarmonicSum(int maxDenominator) {
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        for (int i = 1; i <= maxDenominator; i++) {
            sumL2R += (double) 1 / i;
        }
        for (int i = maxDenominator; i >= 1; i--) {
            sumR2L += (double) 1 / i;
        }
        System.out.println("SumL2R" + sumL2R);
        System.out.println("SumR2L" + sumR2L);
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        return absDiff;
    }
}
