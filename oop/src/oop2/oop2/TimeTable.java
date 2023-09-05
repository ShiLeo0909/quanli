package oop2;

public class TimeTable {
    public static void main(String[] args) {
        int size = 10;
        printTimeTable(size);
    }

    public static void printTimeTable(int size) {
        System.out.printf( " *" + " |");
        for (int i = 1; i <= size; i++) {
            System.out.printf( "%4d" ,i);
        }
        System.out.println();
        for (int i = 0; i <= size; i++) {
            System.out.print("- - ");
        }
        System.out.println();
        for (int j = 1; j <= size; j++) {
            System.out.printf("%2d |" ,j);
            for (int k = 1; k <= size; k++) {
                System.out.printf("%4d", j * k );
            }
            System.out.println();
        }
    }
}
