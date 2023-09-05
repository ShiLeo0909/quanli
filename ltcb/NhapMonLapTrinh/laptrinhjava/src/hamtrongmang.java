import java.util.Scanner;
public class hamtrongmang {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu tu sv"); 
        //gọi ra phần tử trong mang
        String stt = sc.nextLine();    
        String [] A = new String [3];
        // gan phan tu bang 1 ham
        A[0] = mot();
        A[1] = hai();
        A[2] = ba();        
    }
    public static void mot (){
        String ten = "PhungHuuUy";
        String day ="02/08/2004";
        String msv = "22001654";
        System.out.println(ten);
        System.out.println(day);
        System.out.println(msv);
    } 
    public static void hai(){
        String ten = "Vuong Tieu Tre";
        String day ="1/01/2005";
        String msv = "22001654";
        System.out.println(ten);
        System.out.println(day);
        System.out.println(msv);
    }
    public static void ba(){
        String ten = "Hai mom";
        String day ="03/03/2005";
        String msv = "22001654";
        System.out.println(ten);
        System.out.println(day);
        System.out.println(msv);
    }
    
}
