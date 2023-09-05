package oop2;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aplain text string :");
        String str = sc.nextLine();
        printCheckHexStr(str);
    }

    public static void printCheckHexStr(String str) {
        if(!Check(str)){
            System.out.println(str + "is NOT a hex string");
        }else{
            System.out.println(str + "is a hex string");
        }
    }

    public static boolean Check(String str) {
        String string = str.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (valueIndexOf(string.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int valueIndexOf(char string) {
        final String Parent_Chain = "0123456789ABCDEF";
        return Parent_Chain.indexOf(string);
    }
}
