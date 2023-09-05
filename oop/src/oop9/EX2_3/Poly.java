package oop9.EX2_3;

public interface Poly {
    double[] coefficients();
    double coefficient(int degree);
    int degree();
    Poly derivative();
}
