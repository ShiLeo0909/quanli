import java.util.Scanner;
public class bai1gvahT4{
    public static boolean phanh (int n , int[] A){
        for(int i = 0 ; i < n-2 ; i++){
            if(A[i+1]-A[i] != A[i+2]-A[i+1]) return false;
        }
        return true;
    }
    public static boolean phang (int n , int[] A){
        for(int i = 0 ; i <n-1; i++){
            if (A[i]>=A[i+1])
            return false;
        }
     return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int [n];
        for(int i = 0 ; i <n; i++){
            A[i] = sc.nextInt();
        }
        //System.out.pri5ntln(phang(n,A));
        if(!phang(n,A)){
            System.out.println("Khong phai day tang");
        }else{
            System.out.println("La day so tang");
        }
        if(!phanh(n,A)){
            System.out.println("khong phai la csc");
        }else{
            System.out.println("la csc");
        }
    }
}