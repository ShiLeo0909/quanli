package bt;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho va Ten");
        String hoTen = sc.nextLine();
        System.out.println("Diem trung binh");
        double diemTB = sc.nextDouble();
        System.out.println( hoTen + "-" + diemTB);
    }
}
