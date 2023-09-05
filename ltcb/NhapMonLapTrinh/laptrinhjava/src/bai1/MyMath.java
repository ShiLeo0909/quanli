package bai1;

import java.math.BigInteger;

public class MyMath {
    public static double cos(double x) {
        double temp = 1.0;
        double sum = 1.0;
        double tu = 1.0;
        double mau = 1.0;
        int i = 2;
        while (Math.abs(temp) > Math.pow(10, -8)) {
            tu *= -1 * x * x;
            mau = mau * (i - 1) * i;
            temp = tu / mau;
            sum += temp;
            i += 2;
        }
        return sum;
    }

    public static double exp(double x) {
        double sum = 1.0;
        double temp = 1.0;
        double tu = 1.0;
        double mau = 1.0;
        int i = 1;
        while (Math.abs(temp) > Math.pow(10, -8)) {
            tu *= x;
            mau = mau * i;
            temp = tu / mau;
            sum += temp;
            i++;
        }
        return sum;
    }

    public static String toDecimal(String stri, int number) {
        final String str = "0123456789ABCDEF";
        String string = stri.toUpperCase();
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i < string.length(); i++) {
            int digit = str.indexOf(string.charAt(i));
            sum = sum.multiply(BigInteger.valueOf(number)).add(BigInteger.valueOf(digit));
        }
        String summ = String.valueOf(sum);
        return summ;
    }

    public static String decimalTo(String str, int number) {
//        int newnumber = Integer.parseInt(str);
//        String sum = "";
//
//        while (newnumber > 0) {
//            sum = String.valueOf(newnumber % number) + sum;
//            newnumber = newnumber / number;
//        }
//        return sum;
        BigInteger string = new BigInteger(str);
        String sum = "";

        while (string.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = string.mod(BigInteger.valueOf(number));
            sum = remainder.toString() + sum;
            string = string.divide(BigInteger.valueOf(number));
        }

        return sum;
    }

    public static String toRadix(String str, int number1, int number2) {
        String string = decimalTo(toDecimal(str, number1), number2);
        return string;
    }

    public static double caculata() {
        double kq = cos(3.3) * exp(2.2);
        return kq;
    }
}
