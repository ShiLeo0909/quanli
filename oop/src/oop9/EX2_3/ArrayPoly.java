package oop9.EX2_3;

public class ArrayPoly extends AbstracPoly{
    private final double[] coefficients;
    public ArrayPoly(double [] coefficients){
        this.coefficients = coefficients;

    }

    public ArrayPoly() {
        this.coefficients = new double[degree() + 1];
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public double coefficient(int degree) {
        return this.coefficients[degree];
    }

    @Override
    public int degree() {
        return this.coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoefficients = this.derive();
        return new ArrayPoly(derivativeCoefficients);
    }
}
