import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NUMBER = sc.nextLine();
        if (checkDecimal(NUMBER)== true) {
            System.out.println(printHexcadecimal(NUMBER));
        } else {
            System.out.println(NUMBER + "Not the is DECADECIMAL");
        }
    }

    public static boolean checkDecimal(String NUMBER) {
        for (int i = 0; i < NUMBER.length(); i++) {
            if (NUMBER.charAt(i) >= '0' && NUMBER.charAt(i) <+ '9') {
                return true;
            }
        }
        return false;
    }

    public static String printHexcadecimal(String NBER) {
        Integer NUMBER = Integer.parseInt(NBER);
        String HEX = "0123456789ABCDEF";
        char str = 0;
        String order = "";
        while (NUMBER > 0) {
            str = HEX.charAt(NUMBER%16);
            order = str + order;
            NUMBER /= 16;
        }
        return order;
    }
}