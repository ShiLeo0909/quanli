package oop1;

import java.util.Scanner;

public class SumAverageUsingDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lowerBound");
        int lowerBound = sc.nextInt();
        System.out.println("Please enter upperBound");
        int upperBound = sc.nextInt();
        System.out.println(sumAverageUsingDoWhileLoop(lowerBound , upperBound));
    }
    public static double sumAverageUsingDoWhileLoop(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        int element = lowerBound;
        do {
            sum += element;
            count++;
            element++;
        } while (element <= upperBound);
        return (double) sum / count;
    }

}
