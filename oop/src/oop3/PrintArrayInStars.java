import java.util.Scanner;

public class PrintArrayInStars{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the items :");
        int NUMBER_ITEMS = sc.nextInt();
        printArrayInStars(NUMBER_ITEMS ,  sc );
    }
    public static void printArrayInStars(int NUMBER_ITEMS , Scanner sc ){
        int [] array = new int[NUMBER_ITEMS];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(i + ": " );
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*" );
            }
            System.out.println( "(" + array[i] + ")");
        }
    }
}