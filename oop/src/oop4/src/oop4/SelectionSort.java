package oop4;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-3, -4, 4, 9, 5, 6};
        Sort(arr);

    }

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[min] > arr[j]){
                    min = j ;
                }
            }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }

        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

