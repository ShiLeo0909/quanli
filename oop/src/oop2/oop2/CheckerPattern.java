package oop2;

public class CheckerPattern {
    public static void main(String[] args) {
        int size = 7;
        printCheckerPatternUsingForLoop(size);
    }

    public static void printCheckerPatternUsingForLoop(int size) {
        for (int row = 1; row <= size; row++) {
            System.out.print("\t");
            for (int col = 1; col <= size; col++)
                if ( row % 2 == 0 )
                    System.out.print(" " + "#");
                else
                    System.out.print("#" + " ");
            System.out.println();
        }
    }
}



