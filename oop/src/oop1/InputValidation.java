package oop1;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number '0-9'");
        int number1 = sc.nextInt();
        Re_Enter1(number1);
        System.out.println("Enter number '10-100'");
        int number4 = sc.nextInt();
        Re_Enter2(number4);
    }

    public static void Re_Enter1(int number1) {
        Scanner sc = new Scanner(System.in);
        while (number1 > 9) {
            System.out.println("Please Re-Enter");
            int number2 = sc.nextInt();
            if (number2 >= 0 && number2 <= 9) {
                break;
            }else{
                int number3 = sc.nextInt();
            }
        }
    }
    public static void Re_Enter2(int number4) {
        Scanner sc = new Scanner(System.in);
        while (number4 <= 9 || number4 >100) {
            System.out.println("Please Re-Enter");
            int number5 = sc.nextInt();
            if (number5 >= 0 && number5 <= 9) {
                break;
            } else {
                int number6 = sc.nextInt();
            }
        }
    }
}
