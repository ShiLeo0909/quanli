import java.util.Scanner;
public class kiemtragiuaki {
    public static int [] nhap (Scanner sc , int n){
        int [] A = new int [n];
        for(int i = 0 ;i < n;i++ ){
            A[i] = sc.nextInt();
        }
        return A;
    }
    public static void in (int n , int [] A){
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
    public static double tb (int [] A, int n){
        int sum = 0;
        int count = 0;
        for(int i = 0 ;i < n;i++ ){
            if(A[i]< 2){
                break;
            }else{
                for (int j = 0; j < n; j++) {
                    if(A[j] % i != 0){
                        sum = sum + A[j];
                        count = count +1;
                    }
                }
            } 
        }
        return Math.round(sum/count * 1000.0)/1000.0;
    }
    public static void sx(int n, int [] A){
        int tem = A[0];
        for(int i = 0; i < n - 1;i++){
            for (int j = 1; j < n;j++){
                    if (A[i]>A[j]){
                        tem = A[j];
                        A[j] = A[i];
                        A[i] = tem;
                    }
            }
        }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int [] A = nhap(sc,n);
        sx(n,A);
        System.out.println("Tong cac so nguyen to trong mang" + tb(A,n));

    }
}