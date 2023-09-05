import java.util.Scanner;
public class xmatran {
    public static int[][] mang1 ( Scanner sc, int n,int m){
        int[][] A = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        return A ;
    }
    public static int[][] mang2 (Scanner sc,int m, int k){
         int [][] B = new int [m][k];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < k ; j++){
                B[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < k ; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
        return B;
    }  
    public static int[][] tich (int [][] A, int [][] B, int n , int k){
        int [][] C = new int [n][k];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < k ; j++){
                for(int f = 0; f < n; f++){
                    C[i][j] += A[i][f]*B[f][j];
                }
            }
        }
        
        return C;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Ma Tran A:");
        int [][] A = mang1(sc,n,m);
        System.out.println("Ma Tran B:");
        int [][] B = mang2(sc,m,k);
        System.out.println("Ma Tran C:");
        int[][] C = tich(A,B,n,k);
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < k ; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
