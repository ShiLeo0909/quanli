package oop4;

public class PrimeNumbers {  public static void main(String[] args) {
    int n = 10000;
    PerfectPrimeFactorList(n);
    aver(n);
}

    public static boolean checkPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PerfectPrimeFactorList(int n) {
        for (int i = 1; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void aver(int n) {
        double count = 0.0;
        for (int i = 1; i <= n; i++) {
            if (checkPrime(i)) {
                count++;
            }
        }
        double aver = count * 100 / n;
        System.out.printf("%.2f", aver);
    }
}
