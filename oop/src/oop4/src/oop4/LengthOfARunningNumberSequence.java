package oop4;

public class LengthOfARunningNumberSequence {
    public static void main(String[] args) {
    int n = 17;
        System.out.println(NumberSequence(17));
    }
    public static String NumberSequence(int n ){
        if( n == 1){
            return "1";
        }
       return NumberSequence(n-1) + n;
    }
}
