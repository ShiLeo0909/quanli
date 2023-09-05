package oop2;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aplain text string :");
        String str = sc.nextLine();
        printExchangeCipher(str);
    }
    public static void printExchangeCipher(String str){
        String string = str.toUpperCase();
        char [] list = string.toCharArray();
        for (int i = 0; i < string.length()/2; i++) {
            char tmp = list[i];
            list[i] = list[list.length - i-1];
            list[list.length - i-1] = tmp;
        }
        System.out.println(list);
    }
}
