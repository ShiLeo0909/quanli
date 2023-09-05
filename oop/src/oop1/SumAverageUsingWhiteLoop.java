package oop1;

import java.util.Scanner;

public class SumAverageUsingWhiteLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lowerBound");
        int lowerBound = sc.nextInt();
        System.out.println("Please enter upperBound");
        int upperBound = sc.nextInt();
        System.out.println(sumAverageUsingWhiteLoop(lowerBound , upperBound));
    }
    public static double sumAverageUsingWhiteLoop(int lowerBound,
                                                  int upperBound) {
        int sum = 0;
        int count = 0;
        int element = lowerBound;
        while (element <= upperBound) {
            sum += element;
            element++;
            count++;
        }
        return (double) sum / count;
    }
}
