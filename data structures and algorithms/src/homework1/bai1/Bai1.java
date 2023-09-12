package homework1.bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kiểu dữ liệu Int");
        int nextInt = sc.nextInt();
        System.out.println("Nhập kiểu dữ liệu Double");
        double nextDouble = sc.nextDouble();
        System.out.println("Nhập kiểu dữ liệu Long");
        long nextLong = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhập kiểu dữ liệu String");
        String str = sc.nextLine();
        System.out.println();
        System.out.println("Nhập kiểu dữ liệu Byte");
        byte nextByte = sc.nextByte();
        System.out.println("Nhập kiểu dữ liệu Float");
        float nextFloat = sc.nextFloat();
        System.out.println("Nhập kiểu dữ liệu Short");
        short nextShort = sc.nextShort();
        System.out.println("Nhập kiểu dữ liệu Boolean");
        boolean nextBoolean = sc.hasNextBoolean();
        String userInput = sc.nextLine();
        boolean booleanValue;
        // Kiểm tra xem người dùng đã nhập "true" hay "false"
        if (userInput.equalsIgnoreCase("true")) {
            booleanValue = true;
        } else if (userInput.equalsIgnoreCase("false")) {
            booleanValue = false;
        } else {
            System.out.println("Giá trị không hợp lệ. Mặc định được đặt thành false.");
            booleanValue = false;
        }

        System.out.println(nextInt);
        System.out.println(nextDouble);
        System.out.println(nextLong);
        System.out.println(str);
        System.out.println(nextFloat);
        System.out.println(nextByte);
        System.out.println(nextShort);
        System.out.println(nextBoolean);
    }
}
