package bai3de1;

public class ArrayPolynomial extends AbstractPolynomial {
    public ArrayPolynomial(double[] coefficients) {
        super(coefficients);
        reduce();
    }

    private void reduce() {
        while (degree() > 0 && coefficients[degree()] == 0) {
            degree--;
        }
    }

    @Override
    public IPolynomial derivative() {
        double[] derivedCoefficients = differentiate();
        return new ArrayPolynomial(derivedCoefficients);
    }

    @Override
    public IPolynomial integral() {
        double[] integratedCoefficients = integrate();
        return new ArrayPolynomial(integratedCoefficients);
    }

    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree <= this.degree()) {
            return coefficients[degree];
        } else {
            return 0;
        }
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    public String type() {
        return "Array Poly";
    }

    public ArrayPolynomial plus(ArrayPolynomial that) {
        double[] resultCoefficients = new double[Math.max(this.degree() + 1, that.degree() + 1)];
        for (int i = 0; i <= this.degree(); i++) {
            resultCoefficients[i] += this.coefficients[i];
        }
        for (int i = 0; i <= that.degree(); i++) {
            resultCoefficients[i] += that.coefficients[i];
        }
        return new ArrayPolynomial(resultCoefficients);
    }

    public ArrayPolynomial minus(ArrayPolynomial that) {
        double[] resultCoefficients = new double[Math.max(this.degree() + 1, that.degree() + 1)];
        for (int i = 0; i <= this.degree(); i++) {
            resultCoefficients[i] += this.coefficients[i];
        }
        for (int i = 0; i <= that.degree(); i++) {
            resultCoefficients[i] -= that.coefficients[i];
        }
        return new ArrayPolynomial(resultCoefficients);
    }

    public ArrayPolynomial times(ArrayPolynomial that) {
        double[] resultCoefficients = new double[this.degree() + that.degree() + 1];
        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= that.degree(); j++) {
                resultCoefficients[i + j] += this.coefficients[i] * that.coefficients[j];
            }
        }
        return new ArrayPolynomial(resultCoefficients);
    }
}