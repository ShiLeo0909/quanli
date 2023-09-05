package bai3de1;

public abstract class AbstractPolynomial implements IPolynomial {
    protected int degree;
    protected double[] coefficients;

    // Khởi tạo đa thức với các hệ số đã cho
    public AbstractPolynomial(double[] coefficients) {
        this.coefficients = coefficients;
        this.degree = coefficients.length - 1;
    }

    @Override
    public int degree() {
        return degree;
    }

        public double[] differentiate() {
        double[] result = new double[degree];
        for (int i = 1; i <= degree; i++) {
            result[i - 1] = coefficients[i] * i;
        }
        return result;
    }

    // Hằng số trong phép tính tích phân mặc định là 1

    public double[] integrate() {
        double[] result = new double[degree + 2];
        result[0] = 1; // hằng số tích phân
        for (int i = 1; i <= degree + 1; i++) {
            result[i] = coefficients[i - 1] / i;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AbstractPolynomial)) return false;
        AbstractPolynomial other = (AbstractPolynomial) o;
        if (this.degree != other.degree) return false;
        for (int i = 0; i <= degree; i++) {
            if (this.coefficients[i] != other.coefficients[i]) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = degree; i >= 0; i--) {
            if (coefficients[i] != 0) {
                if (coefficients[i] > 0 && i < degree) {
                    sb.append("+");
                }
                sb.append(coefficients[i]);
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i <= degree; i++) {
            result += coefficients[i] * Math.pow(x, degree - i);
        }
        return result;
    }
}
