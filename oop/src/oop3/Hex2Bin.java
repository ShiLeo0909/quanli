import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (checkHex(str)) {
            printHex(str);
        } else {
            System.out.println(str + "the not Hexadecimal ");
        }
    }

    public static boolean checkHex(String str) {
        String string = str.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) < '0' && string.charAt(i) > '9' ||
                    string.charAt(i) < 'A' && string.charAt(i) > 'F') {
                return false;
            }
        }
        return true;
    }

    public static void printHex(String str) {
        String string = str.toUpperCase();
        String HEX = "0123456789ABCDEF";
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111" };
        for (int i = 0; i < string.length(); i++) {
            System.out.println(HEX_BITS[HEX.indexOf(string.charAt(i))]);
        }
    }
}