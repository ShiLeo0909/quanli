package oop1;

import java.util.Scanner;

public class EffectivenesS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lowerBound");
        int lowerBound = sc.nextInt();
        System.out.println("Please enter upperBound");
        int upperBound = sc.nextInt();
        System.out.println(Effectiveness(lowerBound , upperBound));
    }
    public static double Effectiveness(int lowerBound, int upperBound) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }
        return absDiff;
    }
}
