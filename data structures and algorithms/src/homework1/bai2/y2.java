package homework1.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class y2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số nguyên thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(checkNumber(arr));
    }

    public static boolean checkNumber(int[] arr) {
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 2; j < Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    return false;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
}
