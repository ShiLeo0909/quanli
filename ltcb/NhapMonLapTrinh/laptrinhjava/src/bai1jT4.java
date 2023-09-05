import java.util.Scanner;
public class bai1jT4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int [n];
        for(int i = 0 ;i<n ;i++){
            array[i] = sc.nextInt();
        }
        sx(n, array);
        System.out.print("sorted array:  " );
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void sx(int n, int [] array){
        int tem = array[0];
        for(int i = 0; i < n - 1;i++){
            for (int j = i; j < n;j++){
                    if (array[i]>array[j]){
                        tem = array[j];
                        array[j] = array[i];
                        array[i] = tem;
                    }
            }
        }
    }
}