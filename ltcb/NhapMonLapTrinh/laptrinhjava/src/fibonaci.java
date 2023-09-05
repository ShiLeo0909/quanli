import java.util.Scanner;
	public class bttht2{
	public static int fibonaci ( int n){
		int i = 2;
		int f1 = 1,f2 = 1,fn=0;
		if ( n == 1 || n == 2){
			return 1;
		}
		else{
			while (i<n){
				fn = f1 + f2;
				f1 = f2;
				f2 = fn;
				i++;
			} 
		}
		return fn;
	}
	public static int tong (int n){
		int sum = 0;
		for (int i= 1;i<=n;i++){
			sum += fibonaci(i);
			}
			return sum;
	}
	public static boolean kiemtra(int n){
		if(n<1){
			return false;
		}else{
			for(int i = 1;i <= n+1;i++){
				if( n== fibonaci(i)){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n =");
		int n = sc.nextInt();
		System.out.println("So fibonaci thu n =" + n + "la" + fibonaci(n));
		System.out.println("tong" + n + "so fibonaci da tien la" + tong(n));
		if(kiemtra(n)){
			System.out.println(n + "la so Fibonaci");
		}else{
			System.out.println(n + "khong la so Fibonaci");
		}
	}
}
	