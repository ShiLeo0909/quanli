import java.util.Scanner;
public class bai1dT4{
    public static double ttb (int n,int [] array){
        int count = 0 ;
        double sum = 0 ;
        for (int i = 0;i<array.length;i++){
            if (array[i] > 0) {
                sum += array[i] ;
                count = count + 1 ;
            }
        }
        if (count == 0) {
            return 0 ;
        }
        return Math.round(sum/count *100.00) / 100.00 ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt() ;
        int[] array = new int[n] ;
        for (int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }
        System.out.print("Trung binh con cac so duong" + ttb(n,array)) ;
    }
}
