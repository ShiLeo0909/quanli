package oop9.EX1_1.EX2_3;

public interface Poly {
    double[] coefficients();
    double coefficient(int degree);
    int degree();
    Poly derivative();
}
