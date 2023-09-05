package oop1;

import java.util.Scanner;

public class SumAvarageRunningInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lowerBound");
        int lowerBound = sc.nextInt();
        System.out.println("Please enter upperBound");
        int upperBound = sc.nextInt();
    }


    public static double sumAverageUsingForLoop(int lowerBound,
                                                int upperBound) {
        int sum = 0;
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }
}
