package bai3de1;

public interface IPolynomial {
    int degree();

    IPolynomial derivative();

    IPolynomial integral();

    double coefficient(int degree);

    double[] coefficients();

    double evaluate(double x);
}
