import java.util.Scanner;
/**
 * bai1eT4
 */
public class bai1eT4 {

    public static double sole(int n ,int [] array){
        double sum = 0;
        int count = 0;
        for(int i =1; i < array.length; i++){
            if(i%2 != 0){
                sum += array[i];
                count++;
            }
        }
        if(count ==0){
            return 0;
        }
        return Math.round(sum/count *100.00)/100.00;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int [n];
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Trung binh cong cac so ở vi tri le :" + sole(n,array));
    }
}