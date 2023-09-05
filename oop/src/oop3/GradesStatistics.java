import java.util.Scanner;

public class GradesStatistics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number o f s t u d e n t s :");
        int NUMBER_STUDENT = sc.nextInt();
        int [] arrayStudent = new int [NUMBER_STUDENT];
        for (int i = 1; i <= arrayStudent.length; i++) {
            System.out.print("Enter the grade for student " + i+ " =");
            arrayStudent[i] = sc.nextInt();
        }
        printAverage(arrayStudent);
        printMinimim(arrayStudent);
        printMaxsimim(arrayStudent);
    }
    public static void printAverage(int [] arrayStudent){
        int sum = 0;
        int count =0;
        double aver =0;
        for (int i = 0; i < arrayStudent.length; i++) {
            sum += arrayStudent[i];
            count++;
        }
        aver = sum/count;
        System.out.println(aver);
    }
    public static void printMinimim(int [] arrayStudent){
        int numberMin = arrayStudent[0];
        for (int i =1; i < arrayStudent.length-1; i++) {
            if(numberMin < arrayStudent[i]){
                numberMin = arrayStudent[i];
            }
        }
        System.out.println(numberMin);
    }
    public static void printMaxsimim(int [] arrayStudent){
        int numberMax = arrayStudent[0];
        for (int i =1; i < arrayStudent.length-1; i++) {
            if(numberMax > arrayStudent[i]){
                numberMax = arrayStudent[i];
            }
        }
        System.out.println(numberMax);
    }
}