package homework1.bai2;

import java.util.Scanner;

public class y3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Kiểm tra" + n +"có phải số nguyueen tố hay không");
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
