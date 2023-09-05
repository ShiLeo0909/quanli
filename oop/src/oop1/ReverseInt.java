package oop1;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        reverseInt(number);
    }
    public static void reverseInt(int number){
        int tem = 0;
        while(number> 0){
            tem  = number%10;
            number /= 10;
            System.out.print(tem);
        }
    }
}
