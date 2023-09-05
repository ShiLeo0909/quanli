package oop2;

public class HillPattern {
    public static void main(String[] args) {
        int size = 5;
        printHillPatternA(size);
        printHillPatternB(size);
        printHillPatternC(size);
        printHillPatternD(size);
    }
    public static void printHillPatternA(int size){
        for (int i = 1; i <= size ; i++) {
            System.out.println("\t");
            for (int j =  1; j <= (2*size-1) ; j++) {
                if ((i + j) >= 6 && (j-i) < 5){
                    System.out.print("#" + " ");
                }else {
                    System.out.print("  ");
                }
            }
        }
    }
    public static void printHillPatternB(int size){
        for (int i = 1; i <= size ; i++) {
            System.out.println("\t");
            for (int j =  1; j <= (2*size-1) ; j++) {
                if ((i <= j) && (j+i) <= 10){
                    System.out.print("#" + " ");
                }else {
                    System.out.print("  ");
                }
            }
        }
    }
    public static void printHillPatternC(int size){
        for (int i = 1; i <= size-1 ; i++) {
            System.out.println("\t");
            for (int j =  1; j <= (2*size-1) ; j++) {
                if ((i + j) >= 6 && (j-i) < 5){
                    System.out.print("#" + " ");
                }else  {
                    System.out.print("  ");
                }
            }
        }
        for (int i = 1; i <= size ; i++) {
            System.out.println("\t");
            for (int j =  1; j <= (2*size-1) ; j++) {
                if ((i <= j) && (j+i) <= 10){
                    System.out.print("#" + " ");
                }else  {
                    System.out.print("  ");
                }
            }
        }
    }
    public static void printHillPatternD(int size){
        for (int i = 1; i <= 2*size-1 ; i++) {
            System.out.println("\t");
            for (int j =  1; j <= (2*size-1) ; j++) {
                if ((i + j) <= 6 || j -i  >= 4 || j + i >= 14 || i - j >= 4){
                    System.out.print("#" + " ");
                }else  {
                    System.out.print("  ");
                }
            }
        }
    }
}
