import java.util.Scanner;
public class bai12lt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap ten cua ban:");
		String name1 = sc.nextLine();
		while (name1.length()<2){
			System.out.println("hay nhap lai ten cua ban:");
			name1=sc.nextLine();
		}
		System.out.println("Nhap ho cua ban:");;
		String name2 = sc.nextLine();
		if(name2.length()<2){
			System.out.println("Hay nhap lai ho cua bạn:");
			name2 = sc.next1Line();
		}
		}
		
		//System.out.print("Nhap ma nhan vien cua ban:");
		
	}

