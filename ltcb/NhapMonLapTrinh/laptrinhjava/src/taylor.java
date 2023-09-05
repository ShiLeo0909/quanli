import java.util.Scanner;
import java.lang.Math;
public class taylor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x:");
        double x = sc.nextDouble();
        Math.toRadians(x);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        System.out.println(tinh(x,n));
        
    }
    public static double tinh (double x , int n){
        int a = 1;
        double c = 0;
        int b = 0;
        for (int i = 3; i < n; i++) {
            b += -(2*x)*(2*x)/(n-2)*(n-1);
            c = a + b;
        } 
        return Math.round(c * 100.00)/100.00;
    }
}
