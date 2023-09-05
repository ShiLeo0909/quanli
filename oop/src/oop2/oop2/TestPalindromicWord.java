package oop2;

import java.util.Scanner;


public class TestPalindromicWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a String: ");
        String inStr = sc.nextLine().toLowerCase();
        checkPalindromicWord(inStr);
    }

    public static void checkPalindromicWord(String inStr) {
        String fIdx = sanitizeString(inStr);
        String bIdx = "";
        for (int i = fIdx.length() - 1; i >= 0; i--) {
            bIdx += fIdx.charAt(i);
        }

        if (bIdx.equals(fIdx)) {
            System.out.println(inStr + " is a palindrome !");
        } else {
            System.out.println(inStr + " is not a palindrome !");
        }
    }

    public static String sanitizeString(String inStr) {
        String str = "";
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case ':':
                case ',':
                case '.':
                case '?':
                case '!':
                case '-':
                case '/':
                case '+':
                    break;
                default:
                    str += inStr.charAt(i);
                    break;
            }
        }
        return str;
    }
}

