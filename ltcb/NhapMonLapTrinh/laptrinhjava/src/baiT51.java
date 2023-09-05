import java.util.Scanner;
public class baiT51{
public static int[][] tong (int [][]A,int [][]B){
    int [][]C = new int[A.length][A[0].length];
    for(int i = 0; i<A.length; i++){
        for(int j = 0; j<A[0].length; j++){
            C[i][j] = A[i][j]+B[i][j];
        }
    }
    return C;
}
/*public static void printMatrix(int[][] matrix){
    for (int i=0; i<matrix.length; i++){
        for(int j=0; j< matrix[0].length; j++){
            System.out.print(matrix[i][j] + " ")
        }
        System.out.println();
    }
}*/
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int [][] A = new int [n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            A[i][j] = sc.nextInt();
        }
    }
    int [][] B = new int [n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            B[i][j] = sc.nextInt();
        }
    }
    int [][]C= tong(A,B);
    System.out.println("Ma tran C =");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(C[i][j]+" ");
        }
        System.out.println("");
    }
}

}