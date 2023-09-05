import java.util.Scanner;
public class phantichthanhtichcacsonguyento{
	public static boolean xx (int n){
		if ( n<2 ){
			return false;
		}else{
			for (int i = 2; i <= Math.sqrt(n);i++){
				if(n % i == 0){
					return false;
				}
			}
			return true;
		}
	}
	public static String ptich (int n){
		String pt= "";
		int i = 2;
		while (n>1){
		if (xx(n)){
			pt += n;
			return pt;
		}
		if(xx(i) && n%i==0){
				pt += i + "*";
				n = n/i;
		} else{
			i++;
		}
		}
		return pt;		
	}
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println( ptich(n));
	}
}