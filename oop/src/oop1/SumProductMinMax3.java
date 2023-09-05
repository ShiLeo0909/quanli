package oop1;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        sumProductMinMax3(3, 5, 6);
    }
    public static void sumProductMinMax3(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        System.out.println("The sum is : " + sum);
        int volume = number1 * number2 * number3;
        System.out.println("The product is : " + volume);
        if (number1 > number2 && number1 > number3) {
            System.out.println("The max is : " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The max is : " + number2);
        } else {
            System.out.println("The max is : " + number3);
        }
        if (number1 < number2 && number1 < number3) {
            System.out.println("The min is : " + number1);
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("The min is : " + number2);
        } else {
            System.out.println("The min is : " + number3);
        }
    }
}
