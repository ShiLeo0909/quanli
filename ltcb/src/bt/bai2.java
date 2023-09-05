package bt;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chuvi ,dientich;
        System.out.println("Nhap chieu dai");
        int cd = sc.nextInt();
        System.out.println("Nhap chieu rong");
        int cr = sc.nextInt();
        chuvi = (cd + cr)*2;
        dientich = cd*cr;
        System.out.println("Chu vi cua hcn =" + chuvi);
        System.out.println("Dien tich cua hcn =" + dientich);
        System.out.println("Canh nho nhat =" + Math.min(cd,cr));

    }
}
