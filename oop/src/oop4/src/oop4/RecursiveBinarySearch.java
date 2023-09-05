package oop4;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int key = 5;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = arr[0];
        int right = arr[arr.length - 1];
        System.out.println(linearSearch(arr, right, left, key));
    }

    public static int linearSearch(int[] arr, int right, int left, int key) {
        int mid = (left + right) / 2;
        if (arr[mid] > key) {
            return linearSearch(arr, mid - 1, left, key);
        } else if (arr[mid] < key) {
            return linearSearch(arr, right, mid + 1, key);
        } else if (key == arr[mid]) {
            return mid;
        }
        return -1;
    }
}
