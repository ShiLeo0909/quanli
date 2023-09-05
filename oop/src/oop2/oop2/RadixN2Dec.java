package oop2;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radix :");
        int radix = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string");
        String str = sc.nextLine();
        checkRadix(radix , str);
    }

    public static boolean BinaryNumber(int radix, String str) {
        if (radix == 2) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean OctNumber(int radix, String str) {
        if (radix == 8) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) <= '0' && str.charAt(i) >= '9') {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean HexNumber(int radix, String str) {
        if (radix == 16) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) <= '0' && str.charAt(i) >= '9' || str.charAt(i) <= 'a' && str.charAt(i) >= '9') {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static double calculateBin2Dec(int radix, String str) {
        int number = Integer.parseInt(str);
        int sum = 0;
        int i = 0;
        while (number > 0) {
            sum += number % 10 * Math.pow(2, i);
            number /= 10;
            i++;
        }
        return sum;
    }

    public static double calculateOct2Dec(int radix, String str) {
        int number = Integer.parseInt(str);
        int sum = 0;
        int i = 0;
        while (number > 0) {
            sum += number % 10 * Math.pow(8, i);
            number /= 10;
            i++;
        }
        return sum;
    }

    public static double calculateHex2Dec(int radix, String str) {
        String hex = "0123456789abcdef";
        String inStrtoLowerCase = str.toLowerCase();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum * 16 + hex.indexOf(inStrtoLowerCase.charAt(i));
        }
        return sum;
    }

    public static void checkRadix(int radix, String str) {
        if (radix == 2) {
            if (BinaryNumber(radix, str)) {
                System.out.println("The equivalent decimal number " + str + " is: " + calculateBin2Dec(radix, str));
            } else {
                System.out.println("Invalid binary number !");
            }
        } else if (radix == 8) {
            if (OctNumber(radix, str)) {
                System.out.println("The equivalent decimal number " + str + " is: " + calculateOct2Dec(radix, str));
            } else {
                System.out.println("Invalid octal number !");
            }
        } else if (radix == 16) {
            if (HexNumber(radix, str)) {
                System.out.println("The equivalent decimal number " + str + " is: " + calculateHex2Dec(radix, str));
            } else {
                System.out.println("Invalid hexadecimal number !");
            }
        } else {
            System.out.println("Invalid radix number !");
        }
    }
}