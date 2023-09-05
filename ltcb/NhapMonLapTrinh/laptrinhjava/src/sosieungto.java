import java.util.Scanner;
class sosieungto {
		public static boolean checkNTo(int n){
			if ( n<2){
				return false;
			}
			for (int i = 2;i<=Math.sqrt(n); i++){
				if (n % i == 0){
					return false;
				}
			}
			return true;
		}
		public static boolean checkNew2(int n){
			while(n > 0){
				if( checkNTo(n) == false){
					return false;
				}
				n = n / 10;
			}
			return true;
		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println(checkNew2(n));
		}
}