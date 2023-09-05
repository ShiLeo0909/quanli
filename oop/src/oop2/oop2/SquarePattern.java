package oop2;

public class SquarePattern {
    public static void main(String[] args) {
        int size =5;
        System.out.println("printSquarePatternUsingForLoop");
        printSquarePatternUsingForLoop(size);
        System.out.println();
        final int MYSIZE = 5;
        final String MYCHAR = "*";
        System.out.println(" printSquareUsingWhileLoop");
        printSquareUsingWhileLoop(MYSIZE, MYCHAR);

    }

    public static void printSquarePatternUsingForLoop(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col == size - 1) {
                    System.out.print("#" + " ");
                } else {
                    System.out.print("#" + " ");
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }

    public static void printSquareUsingWhileLoop(int size, String myChar) {
        int row = 0;
        while (row < size) {
            int col = 0;
            while (col < size) {
                if (col == size - 1) {
                    System.out.print(myChar);
                } else {
                    System.out.print(myChar + " ");
                }
                col++;
            }
            if (row < size - 1) {
                System.out.println();
            }
            row++;
        }
    }
}
