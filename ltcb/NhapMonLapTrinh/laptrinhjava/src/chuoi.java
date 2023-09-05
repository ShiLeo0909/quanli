import java.util.Random; 
public class chuoi{
    public static void main (String [] args){
        Random  Ran = new Random();
        int n = 3;
        System.out.println(n);
        int m = 3;
        System.out.println(m);
        int [][] A = new int [n][m];
        int [][] B = new int [n][m];
        int [] C = new int [5];
        int [] D = new int [5];
        double [] E = new double [5];
        double [] F = new double [5];
        double [] U = new double [5];
        double [] Y = new double [5];
        int t = m*n;
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j<m;j++){
                A[i][j]=Ran.nextInt(5);
            }
        }
        System.out.println("Mang A:");
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j<m;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        } 
        System.out.println("hA:");
         for(int i = 0;i<n;i++){
            for(int j = 0 ;j<m;j++){
                C[A[i][j]] +=1;
            }
        }
        for(int i = 0 ; i<5;i++){
            System.out.println(C[i]+ " ");
        }
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                B[i][j]=Ran.nextInt(5);
            }
        }
        System.out.println("Mang B:");
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("hB:");
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                D[B[i][j]]+=1;
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(D[i]+ " ");
        }
        System.out.println("pa:");
        for (int i= 0 ; i<5 ; i++){
            E[i] = (double) C[i]/9;
        }
        for(int i = 0; i<5;i++){
            System.out.println(E[i]+" ");
        }
        System.out.println("pb:");
        for (int i = 0 ; i<5 ; i++){
                F[i] =(double) D[i]/9;
        }
        for(int i = 0;i<5;i++){
            System.out.println(F[i]+" ");
        }
        System.out.println("PA:");
        for (int i = 1 ; i<5 ; i++){
            U[0] = E[0];
            U[i] = U[i-1] + E[i];
        }
        for(int i = 0; i<5;i++){
            System.out.println(U[i]+" ");
        }
        System.out.println("PB:");
        for(int i = 1; i < 5 ;i++ ){
            Y[0] = F[0]; 
            Y[i] = Y[i-1] + F[i];
        }
        for(int i = 0; i<5;i++){
            System.out.println(Y[i]+" ");
        }
       
        //so sanh PA vs Pb va doi Ha vs Hb
        for (int i = 0; i < U.length; i++) {
            double min=Math.abs(Y[0]-U[i]);
            int k=0;
            for (int j = 0; j < Y.length; j++) {
                if(Math.abs(Y[j]-U[i])<min){
                    min=Math.abs(Y[j]-U[i]);
                    k=j;
                }
            }
            C[i]=D[k];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]+" ");
        }
    }
}
          