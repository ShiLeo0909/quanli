package oop4;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6 ;
        System.out.println(fibonaci(6));
    }
    public static int fibonaci(int n){
        if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            return fibonaci(n-1) + fibonaci(n-2);
        }
    }
}
