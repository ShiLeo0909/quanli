package bt;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thetich;
        System.out.println("Nhap canh cua khoi lap phuong");
        int c = sc.nextInt();
        thetich = c*c*c;
        System.out.println("The tich cua khoi lap phuong =" + thetich);
    }
}
