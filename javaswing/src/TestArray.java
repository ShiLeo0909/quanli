import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ( i < k) {
                arr[i] = - arr[i];
            }
            sum += arr[i];
        }
        System.out.println(sum);



    }
}