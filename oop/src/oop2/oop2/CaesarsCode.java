package oop2;

import java.util.Scanner;

public class CaesarsCode {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter aplain text string");
        String str = sc.nextLine();
         printCaesarsCode(str);

    }
    public static void printCaesarsCode(String str) {
        String upperString = str.toUpperCase();
        char[] list = upperString.toCharArray();
        char Caesar = 0;
        for (int i = 0; i < list.length; i++) {
            char ch = list[i];
            int asciiCode = ch;
            int asciiValue = (int) ch;
            asciiValue += 3;
            int hc = asciiValue;
            Caesar = (char) hc;
            System.out.print(Caesar);
        }
    }
}
