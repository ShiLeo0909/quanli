package oop4;

public class PerfectandDeficientNumbers {
    public static void main(String[] args) {
        int number = 1000;
        for (int i = 1; i <= number ; i++) {
            if(isPerfect(i)){
                System.out.print(i + " ");
            }
        }
        System.out.print(" 3perfect numbers found :");
        perfectRatio(number);
        for (int i = 1; i <= 20; i++) {
           if(isDeficient(i)){
               System.out.print( i + " ");
           }
        }
        System.out.println("....");
        missingNumberRatio(number);
        imperfectOrMissingNumber(number);
    }

    public static boolean isPerfect(int PosInt) {
        int sum = 0;
        for (int i = 1; i <= PosInt / 2; i++) {
            if (PosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == PosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int PosInt) {
        int sum = 0;
        for (int i = 1; i <= PosInt / 2; i++) {
            if (PosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < PosInt) {
            return true;
        }
        return false;
    }

    public static void perfectRatio(int number) {
        double count = 0.0;
        for (int i = 1; i <= number; i++) {
            if (isPerfect(i)) {
                count++;
            }
        }
        double result = count*100/number;
        System.out.printf("%.2f\n",result );
    }

    public static void missingNumberRatio(int number) {
        double count = 0.0;
        for (int i = 1; i <= number; i++) {
            if (isDeficient(i)) {
                count++;
            }
        }
        double result = count*100/number;
        System.out.printf("%.2f\n", result );
    }
    public static void imperfectOrMissingNumber(int number){
        double count = 0.0;
        for (int i = 1; i <= number; i++) {
            if(!isDeficient(i) && !isPerfect(i)){
                count++;
            }
        }
        double result = count*100/number;
        System.out.printf("%.2f" , result);
    }

}