package bai1;

public class MyMath {
    public static double sin(double x) {
        /* TODO */
        double result = 0;
        double term = x;
        int sign = 1;
        int factorial = 1;

        for (int n = 1; n <= 10; n += 2) {
            result += sign * term / factorial;
            term *= x * x;
            factorial *= (n + 1) * (n + 2);
            sign *= -1;
        }

        return result;
    }

    public static double cos(double x) {
        /* TODO */
        double result = 0;
        double term = 1;
        int sign = 1;
        int factorial = 1;

        for (int n = 0; n <= 10; n += 2) {
            result += sign * term / factorial;
            term *= x * x;
            factorial *= (n + 1) * (n + 2);
            sign *= -1;
        }

        return result;
    }

    public double exp(double x) {
        /* TODO */
        double result = 0;
        double term = 1;
        int sign = 1;
        int factorial = 1;

        for (int n = 0; n <= 10; n += 2) {
            result += sign * term / factorial;
            term *= x * x;
            factorial *= (n + 1) * (n + 2);
            sign *= -1;
        }

        return result;
    }

    public double ln(double x) {
        /* TODO */
        double result = 0;
        double term = x - 1;
        int sign = 1;

        for (int n = 1; n <= 10; n++) {
            result += sign * term / n;
            term *= -(x - 1);
            sign *= -1;
        }

        return result;
    }
}