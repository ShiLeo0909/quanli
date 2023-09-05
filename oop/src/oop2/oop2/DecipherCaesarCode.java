package oop2;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aplain text string");
        String str = sc.nextLine();
        printDecipherCaesarCode(str);
    }
    public static void printDecipherCaesarCode(String str){
        String decipherCaesarCode = str.toUpperCase();
        char [] list = decipherCaesarCode.toCharArray();
        char Caesar = 0;
        for (int i = 0; i < list.length; i++) {
            char ch = list[i];
            int asciiCode = ch;
            int asciiValue = (int) ch;
            asciiValue -= 3;
            int hc = asciiValue;
            Caesar = (char) hc;
            System.out.print(Caesar);
        }
    }
}
