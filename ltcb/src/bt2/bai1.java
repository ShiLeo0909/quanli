package bt2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kích thưc cua mang");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap phan tu X");
        double x = sc.nextDouble();
        System.out.println("Tong =" + tinh(arr , x));

    }
    public static double tinh ( int []  arr , double x){
        double sum = arr[0];
        double t = 1;
        for (int i = 0; i < arr.length-1; i++) {
            t *= -x*x;
            sum += arr[i+1]*t;
        }
        return sum;
    }
}
