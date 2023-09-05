import java.util.Scanner;
public class bai7T5{
    public boolean in (int n, int []A){
        for(int i = 0;i<n;i++){
            if(A[i]<2){
                return false;
            }else{
                for(int i = 0 ; i<Math.sqrt(n);i++){
                    if(n%i==0){
                        return false;
                    }
                    return true;
                }
                return true;
            }
            if(in(i)){ 
                System.out.println("Số nguyên trong mảng là "+i);
            }
           
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int [n];
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            A[i] = sc.nextInt();
        for(int i = 0; i<n;i++){
            System.out.println(A[i]+" ");
        }
        System.out.println( in ( n , A ));
        }
    }
}