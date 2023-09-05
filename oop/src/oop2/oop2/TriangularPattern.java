package oop2;

public class TriangularPattern {
    public static void main(String[] args) {
       int size = 8 ;
        printTriangularPatternUsingOfLoop(size);
    }
    public static void printTriangularPatternUsingOfLoop(int size){
        for (int row = 1 ; row <= size ; row++) {
            System.out.println("\t");
            for (int col = 1; row >= col ; col++) {
                if ( row >= col){
                    System.out.print("#" + " ");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}
