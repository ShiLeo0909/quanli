import java.util.Scanner;
import java.lang.Math;
	public class bai9lt{
		public static double sinx (double x, int n ){
			double sin = x;			
			double ps = x;
			for (int i = 3 ; i <= n ; i+= 2){
				ps = -ps * x * x / i / ( i - 1 );
			sin += ps;
		}
		return sin;
		}
		public static double cosx(double x,int n ){
			double cox = 1;
			double ps = 1 ;
			for (int i = 2 ; i <= n; i+=2 ){
				ps = -ps * x * x / i / ( i - 1 );
			cox += ps;
		}
		return cox;
	}	
		
	
		
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			double x = sc.nextDouble();
			System.out.println(Math.round(sinx(x,n)*100.0)/100.0);
			System.out.println(Math.round(cosx(x,n)*100.0)/100.0);
		}
}