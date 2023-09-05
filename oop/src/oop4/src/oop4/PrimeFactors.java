package oop4;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 100;
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

    public static boolean PerfectPrimeFactorList(int i) {
        int key = i;
        int nb = 1;
        if (checkPrime(i)) {
            return false;
        }
        for (int j = 2; j <= i; j++) {
            if (i % j == 0 && checkPrime(j) == true) {
                nb *= j;
                i /= j;
            }
        }
        if (nb != key) {
            return false;
        }
        return true;
    }


    public static void aver(int n) {
        double count = 0.0;
        double aver = 0.0;
        for (int i = 2; i <= n; i++) {
            if (PerfectPrimeFactorList(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        aver = count * 100 / n;
        System.out.printf("%.2f", aver);
    }
}

