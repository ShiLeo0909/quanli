package mypolynomial1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder poly = new StringBuilder();
        for (int i = 0; i < coeffs.length; i++) {
            poly.append(this.coeffs[i]).append("x^").append(i).append(" + ");
        }
        poly.delete(poly.length()-3, poly.length());
        return poly.toString();
    }

    public double evaluate (double x) {
        double multiX = 1;
        double result = 0;
        for (double i : coeffs) {
            result += multiX * i;
            multiX *= x;
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right) {
        int minDegree = Math.min(this.getDegree(), right.getDegree());
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolyCoeff = new double[maxDegree];
        for (int i = 0; i < minDegree; i++) {
            addPolyCoeff[i] = this.getDegree() + right.getDegree();
        }
        if (this.getDegree() > right.getDegree()) {
            for (int i = minDegree + 1; i < maxDegree; i++){
                addPolyCoeff[i] = this.coeffs[i];
            }
        } else {
            for (int i = minDegree + 1; i < maxDegree; i++){
                addPolyCoeff[i] =  right.coeffs[i];
            }
        }
        return new MyPolynomial(addPolyCoeff);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] result = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                result[i + j] += coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(result);
    }


}