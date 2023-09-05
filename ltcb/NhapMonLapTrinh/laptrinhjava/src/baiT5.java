import java.util.Scanner;
public class baiT5 {
	public static int max(int n, int m, int[][] A){
		int max = A[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// int max = A[0][0];
				// for(int[] num: A){
				// if (max<num)max=num;
				// }
				if (max < A[i][j]) {
					max = A[i][j];
				}
			}
		}
		return max;
	}

	public static double average(int[][] A) {
		double tb = 0;
		int n = A.length;
		int m = A[0].length;
		int c = m * n;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum = sum + A[i][j];

			}
		}
		// return Math.round(sum/c*100.00) / 100.00 ;
		tb = (double) sum / c;
		return tb;
	}
	public static void hang(int n,int m, int [][] A){
		int max1=0;
		for (int i = 0; i < n; i++) {
			max1 = A[i][0];
			for (int j = 0; j < m; j++) {
				if(max1<A[i][j]){
					max1=A[i][j];
				}
			}
			System.out.println(" "+max1);
		}
	}
	public static void ttc(int [][] A){
		int n = A.length;
		int m = A[0].length;
		for (int i = 0; i < n; i++) {
			int sum =0;
			for (int j = 0; j < m; j++) {
				sum = sum + A[i][j];
			}
			double avg = (double) sum/m;
			System.out.println(avg);
		}
	}	


	public static boolean check1 (int n, int m, int [][] A){
		if(n!=m){
			return false;
		}else{
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (A[i][j] != A[j][i]) return false;
				}
			}
			return true;
		}
	}
	public static boolean check2(int n,int m,int [][]A){
		if(n!=m){
			return false;
		}else{
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
				if(i!=j && A[i][j]!=0){
					return false;
				}
				if(i!=j && A[i][j]==0){
					return true;
				}
			}
		}return true;
	}
}
	public static boolean check3 (int n,int m,int [][] A){
		if(m != n){
			return false;
		}else{
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(i==j && A[i][j]!=1){
						return false;
					}	
					if(i!=j && A[i][j]!=0){
						return false;
					}	
				}
			}
		}
		return true;
	}
	public static boolean check4(int n, int m ,int [][] A){
				if(n!=m){
					return false;
				}else{
					for(int i =0;i<n;i++){
						for(int j = 0;j<i;j++){
							if(A[i][j]!=0){
								return false;
							}else{
								return true;
							}
						}
					}
				}return true;
			}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] A = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Max =" + max(n, m, A));
		System.out.printf("average = %.2f", (average(A)));
		System.out.println("so lon nhat trong 3 hang la ");
		hang(m,n,A);
		System.out.println("Trung binh cong cac phan tu trong hang");
		ttc(A);
		if(check1(m,n,A)){
			System.out.println("La ma tran doi xung");
		}else{
			System.out.println("Khong la ma tran doi xung");
		}
		if(check2(n,m,A)){
			System.out.println("La ma tran cheo");
		}else{
			System.out.println("Khong la ma tran cheo");
		}
		if(check3(n,m,A)){
			System.out.println("La ma tran don vi");
		}else{
			System.out.println("Khong la ma tran don vi");
		}
		if(check4(n,m,A)){
			System.out.println("La ma tran tam giac");
		}else{
			System.out.println("Khong la ma tra tam giac");
		}
	}
}
