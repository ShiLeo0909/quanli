import java.util.Scanner;

public class sumcolumns {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int row = keyboard.nextInt();
        int col = keyboard.nextInt();
        int [][] matrix = new int [row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                matrix[i][j] = keyboard.nextInt();

                
            }
        }
        sumColumns(matrix);


        // input rows
        // input columns
        // call inputMatrix method to input values of the matrix, or call generateMatrix to generate a matrix
        // call sumColumns to sum columns of the matrix
        // print array
        /* TODO */
    }
    
  
    
    
    
    public static void sumColumns(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length; 
        for(int j = 0;j<col;j++){
            int sum = 0;
            for(int i = 0;i<row;i++){
                sum = sum + matrix[i][j];
            }
            System.out.print(" "+ sum);
        }
           
        /* TODO */
    }
    
   
}
    
   