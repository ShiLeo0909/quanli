package oop1;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lowerBound");
        int lowerBound = sc.nextInt();
        System.out.println("Please enter upperBound");
        int upperBound = sc.nextInt();
        System.out.println(sumOfSquares(lowerBound , upperBound));
    }
    public static double sumOfSquares(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

}
