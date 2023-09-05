//package bai3de1;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListPolynomial extends AbstractPolynomial {
//    private List<Double> coefficients;
//
//    public ListPolynomial(double[] coefficients) {
//        this.coefficients = new ArrayList<>();
//        for (double coefficient : coefficients) {
//            this.coefficients.add(coefficient);
//        }
//        reduce();
//    }
//
//    private void reduce() {
//        while (degree() > 0 && coefficients.get(degree()) == 0) {
//            coefficients.remove(degree());
//            degree--;
//        }
//    }
//
//    @Override
//    public IPolynomial derivative() {
//        double[] derivedCoefficients = differentiate();
//        return new ListPolynomial(derivedCoefficients);
//    }
//
//    @Override
//    public IPolynomial integral() {
//        double[] integratedCoefficients = integrate();
//        return new ListPolynomial(integratedCoefficients);
//    }
//
//    @Override
//    public double coefficient(int degree) {
//        if (degree >= 0 && degree <= this.degree()) {
//            return coefficients.get(degree);
//        } else {
//            return 0;
//        }
//    }
//
//    @Override
//    public double[] coefficients() {
//        double[] result = new double[coefficients.size()];
//        for (int i = 0; i < coefficients.size(); i++) {
//            result[i] = coefficients.get(i);
//        }
//        return result;
//    }
//
//    public String type() {
//        return "List Poly";
//    }
//
//    public ListPolynomial plus(ListPolynomial that) {
//        double[] resultCoefficients = new double[Math.max(this.degree() + 1, that.degree() + 1)];
//        for (int i = 0; i <= this.degree(); i++) {
//            resultCoefficients[i] += this.coefficients.get(i);
//        }
//        for (int i = 0; i <= that.degree(); i++) {
//            resultCoefficients[i] += that.coefficients.get(i);
//        }
//        return new ListPolynomial(resultCoefficients);
//    }
//
//    public ListPolynomial minus(ListPolynomial that) {
//        double[] resultCoefficients = new double[Math.max(this.degree() + 1, that.degree() + 1)];
//        for (int i = 0; i <= this.degree(); i++) {
//            resultCoefficients[i] += this.coefficients.get(i);
//        }
//        for (int i = 0; i <= that.degree(); i++) {
//            resultCoefficients[i] -= that.coefficients.get(i);
//        }
//        return new ListPolynomial(resultCoefficients);
//    }
//
//    public ListPolynomial times(ListPolynomial that) {
//        double[] resultCoefficients = new double[this.degree() + that.degree() + 1];
//        for (int i = 0; i <= this.degree(); i++) {
//            for (int j = 0; j <= that.degree(); j++) {
//                resultCoefficients[i + j] += this.coefficients.get(i) * that.coefficients.get(j);
//            }
//        }
//        return new ListPolynomial(resultCoefficients);
//    }
//}