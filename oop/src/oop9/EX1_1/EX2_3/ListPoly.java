package oop9.EX1_1.EX2_3;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstracPoly{
    private List<Double> coefficients;
    public ListPoly(double[] coeffs){
        this.coefficients = new ArrayList<>();
        for (int i = 0; i < coeffs.length; i++) {
            this.coefficients.add(coeffs[i]);
        }
    }

    @Override
    public double[] coefficients() {
        double[] coefs = new double[this.coefficients.size()];
        for (int i = 0; i < coefs.length;i++){
            coefs[i] = this.coefficient(i);
        }
        return coefs;
    }

    @Override
    public double coefficient(int degree) {
        return this.coefficients.get(degree);
    }

    @Override
    public int degree() {
        return this.coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoefs = this.derive();
        return new ListPoly(derivativeCoefs);
    }
}

