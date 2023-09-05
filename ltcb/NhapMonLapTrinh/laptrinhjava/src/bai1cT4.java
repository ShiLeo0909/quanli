import java.util.Scanner;
public class bai1cT4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double[] array = new double [n];
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            array [i] = sc.nextDouble();
        }
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        for (int i = 0; i < array.length; i++){
            System.out.printf(array[i] + " ");
        }
        double average = sum / array.length;
        System.out.printf("Trung bing cong cac so la :%.2f", average);
        
    }
}
