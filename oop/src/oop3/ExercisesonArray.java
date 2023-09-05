import java.util.Scanner;

public class ExercisesonArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items :");
        int NUMBER_ITEMS = sc.nextInt();
        printExercisesonArray(NUMBER_ITEMS , sc);
    }
    public static void printExercisesonArray(int NUMBER_ITEMS , Scanner sc){
        int [] array = new int[NUMBER_ITEMS];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("The valuesare : [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}