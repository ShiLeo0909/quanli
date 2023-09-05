package oop4;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 5, 3, 2, 1};
        Sort(arr);
    }
    public static void Sort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        print(arr);
    }
    public static void print (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}


