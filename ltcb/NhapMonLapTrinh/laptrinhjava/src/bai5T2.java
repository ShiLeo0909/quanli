
	import java.util.Scanner;
	public class bai5t2 { 
	public static void main(String[] args){
		//phan a
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		n = sc.nextInt();
		for (int i = 1; i <= n;i++){
		sum += i; 
	}
		System.out.println("Tong cac so tu 1 den " + n + " la: " +sum);
		//phan b
	if (n<2) {
		System.out.println("Không phải số nguyên tố ")		
		}else {
			boolean check = true;
			for (int i = 2; i <= Math.sqrt(n); i++){
				if (n % i==0){
					check = false;
					break;
				}
			}
			if (check){
				System.out.println(n + "là số nguyên tố ");
			}else {
				System.out.println(n + "không là số nguyên tố ");
			}
	}
	//phan c 
	System.out.pritln("Các số nguyên tố nhỏ hơn " + n + ":");
	for ( int k = 2; k < n ; k++){
		boolean check = true;
			for (int i = 2;i <= Math.sqrt(k); i++){
				if (k % i == 0){
					check = false;
					break;
				}
	}
	if (check){
		System.out.println(k + " "); 
	}
	System.out.println();
	//d
	System.out.prinln(n + " số nguyên tố đầu tiên :");
		int count = 0;
		int k = 2 ;
	while (count < n ){
		boolean check = true;
		for (int i = 2; i <= Math.sqrt(k); i++){
			if (k % i == 0){
				check = false;
				break;
			}
		}
		if (check){
			System.out.pritln(k + " ");
			count++;
		}
		k++;
	}	
	System.out.println();
	//phan E
	boolean check = true;
	for (int i = 0; i<=n;i++){
		if(Math.pow(i,2) == n){
			check = false;
			break;
		}
	}
	if (check){
		System.out.println(n + "không là số chính phương");
	}else{
		System.out.println(n + "là số chính phương");
	}
	//phần F
	System.out.println("Các số chính phương nhỏ hơn "+ n + ":");
	for (int i = 0; i < Math.sqrt(n); i++){
		System.out.println(i * i = " ");
	}
	System.out.println();
	//phần G
	System.out.println( n + "số chính phương đầu tiên");
	for (int i = 0;i < n;i++){
		System.out.println(i * i + " "); 
			}
		}
	}
	