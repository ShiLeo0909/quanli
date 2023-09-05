package bt;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Phuong trinh bac hai co dang
        // aX^2 + bX + c =0
        int a,b,c;
        double delta;
        System.out.println("Nhap he so cua phuong trinh a, b ,c la:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // tinh delta
        delta = Math.pow(b,2)-4*a*c;
        if(delta<0){
            System.out.println("Khong co can delta");
        }else {
            System.out.println("Căn delta =" + Math.sqrt(delta));
        }
    }
}
