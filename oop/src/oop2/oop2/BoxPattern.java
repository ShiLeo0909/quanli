package oop2;

public class BoxPattern {
    public static void main(String[] args) {
        int size = 8;
        printBoxPatternA(size);
    //    printBoxPatternB(size);
      //  printBoxPatternC(size);
    }
    public static void printBoxPatternA(int size){
        for (int row = 1; row < size ; row++) {
            System.out.println("\t");
            for (int col = 1; col < size; col++) {
                if(row == 1 || col == 1 || row == size-1 || col == size-1){
                    System.out.print("#" + " ");
                }else{
                    System.out.print("  ");
                }
            }
        }
    }
    public static void printBoxPatternB(int size){
        for (int row = 1; row < size ; row++) {
            System.out.println("\t");
            for (int col = 1; col < size; col++) {
                if(row == 1 || row == col || row == (size-1)){
                    System.out.print("#" + " ");
                }else{
                    System.out.print("  ");
                }
            }
        }
    }
    public static void printBoxPatternC(int size){
        for (int row = 1; row < size ; row++) {
            System.out.println("\t");
            for (int col = 1; col < size; col++) {
                if(row == 1 || row == size-1 || (row+col) == (size) || row == col || row == (size/2 -1 ) && col == (size/2 -1) ){
                    System.out.print("#" + " ");
                }else{
                    System.out.print("  ");
                }
            }
        }
    }
}
