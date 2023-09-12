package homework1.bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "Chào quý khách!. Cảm ơn quý khách .đã đến với .Hệ thống nhà ở H-Land. Mọi thông tin cần. hỗ trợ quý khách vui lòng. nhắn tin qua zalo hoặc hotline BQL.tòa nhà 08.7777.5668 . Xin cảm ơn!\n";
        String[] lines = line.split("\\.");

        for (int i = 0; i < lines.length/2; i++) {
            String temp = lines[i];
            lines[i] = lines[lines.length-1-i];
            lines[lines.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(lines));
        String str = "";
        for (int i = 0; i < lines.length; i++) {
            str += lines[i] + ". ";
        }
        System.out.println(str);
    }

}




