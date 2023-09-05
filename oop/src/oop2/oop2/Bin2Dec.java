package oop2;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aplain is string");
        String str = sc.nextLine();
        System.out.println(printBin2Dec(str));
    }

    public static int printBin2Dec(String str) {
        int number = 0;
        int binaryNumber = Integer.parseInt(str);
        int sum = 0;
        int pow = 1;
        int i = 0;
        if (checkBin(str) == false) {
            System.out.println("error : invalid binary string" + str);
            return -1;
        } else {
            while(binaryNumber > 0){
                sum += (binaryNumber%10) * Math.pow(2, i);
                binaryNumber/=10;
                i++;
            }
        }
        return sum;
    }

    private static boolean checkBin(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}
