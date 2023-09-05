package oop2;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println(calculateOct2Dec(str));
    }

    public static boolean checkOct2Dec(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i)<= '9'){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
    public static int calculateOct2Dec(String str){
        int sum =0;
        int number = Integer.parseInt(str);
        int pow = 0;
        while(number > 0){
            sum += number %10 * Math.pow(8, pow);
            number /= 10;
            pow++;
        }
        return sum;
    }
}
