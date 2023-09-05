import java.util.Scanner;
public class congmang{
	public static int[] input ( Scanner sc, int n ){
		int[] A = new int[n];
		for(int i = 0; i<n;i++){
			A[i]= sc.nextInt();
		}
		return A;
	}
	public static int[] output ( Scanner sc, int n ){
		int[] B = new int[n];
		for(int i = 0; i<n;i++){
			B[i]= sc.nextInt();
		}
		return B;
	}
	// public static int mang2 (int n ,int [] B ){
	// 	for(int i = 0; i<n;i++){
	// 		B[i]="";
	// 	}
	// }
	public static int[] tinhtong (int n, int [] A,int [] B){
		int[] C=new int[n];
		for(int i = 0;i<n ;i++){
			C[i]=A[i]+B[i];
		}
		return C;
	}
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] A = input(sc, n);
		int [] B =  input(sc, n);
		// System.out.println("Nhap mang A");
		
		for(int i = 0; i<n;i++){
		System.out.print(A[i]+" ");
		}

		// System.out.println("Nhap mang B");
		// for(int i = 0; i<n;i++){
		// 	B[i] = sc.nextInt();
		// }
		for(int i = 0; i<n;i++){
			System.out.print(B[i]+" ");
		}


		int[] C = tinhtong(n,A, B);
		
		System.out.println("Mang c =");
		for(int i = 0; i<n;i++){
			System.out.print(C[i]+" ");
		}
	}
}
