package bai1de1;

public class MyMath {
    public static double sin(double x) {
        double tu = x;
        double mau = 1;
        double sum = x;
        double temp = 1; // Thay đổi giá trị khởi tạo của temp từ 0 thành x
        int i = 3;
        while (Math.abs(temp) > Math.pow(10, -8)) {
            tu *= (-1) * x * x;
            mau = mau * (i - 1) * i;
            temp = tu / mau;
            sum += temp;
            i += 2;
        }
        return sum;
    }

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
        double tu = 1;
        double mau = 1;
        double sum = 1;
        double temp = 1;
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
    public static double loga(double x) {
        double tu = x;
        double mau = 1;
        double sum = x;
        double temp = x;
        int i = 2;
        while (Math.abs(temp) > Math.pow(10, -8)) {
            tu *= (-1) * x;
            mau = i;
            temp = tu / mau;
            sum += temp;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sin(2.2));
        System.out.println(cos(2.2));
        System.out.println(exp(2.2));
        System.out.println(loga(0.4));
    }
}
