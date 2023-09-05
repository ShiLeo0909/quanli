package oop4;

public class ExercisesOnRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factoria(5));
    }
    public static int factoria ( int n){
        if( n == 0 || n ==1){
            return 1;
        }
        return  n * factoria(n-1);
    }
}
