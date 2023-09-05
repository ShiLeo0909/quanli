import java.util.Scanner; 
	public class Shiina{
	public static int csc (int n){
		int tong = 1 ;
		int i = 1;
		while(i<n){
		tong += 3;
		i++;		
		}
		return tong;
		
}
	public static int csn (int n){
		int tich =1 ;
		int i = 1;
		while (i<n){ 
		tich = tich  * 3;
		i++;
		}
		return tich;
}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n :");
		int n = sc.nextInt();
		System.out.println("CSC phần tử thứ " + n + "là:" + csc (n) );
		System.out.println("CSN phần tử thứ " + n + "là:" + csn (n) );
	}
}
