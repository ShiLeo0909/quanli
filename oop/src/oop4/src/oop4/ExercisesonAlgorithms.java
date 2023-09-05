package oop4;

import java.util.Scanner;

public class ExercisesonAlgorithms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        int[] array = new int[n];
        selectionSort(array);
        int temp = 0;
        insertionSort(array);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int index = i - 1;
            while ((index >= 0) && (array[index] > key)) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = key;
        }
    }
}
