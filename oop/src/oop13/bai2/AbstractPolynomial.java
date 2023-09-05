package oop13.bai2;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        int degree = degree();

        for (int i = 0; i <= degree; i++) {
            double coefficient = coefficient(i);

            if (coefficient != 0) {
                if (coefficient > 0 && sb.length() > 0) {
                    sb.append(" + ");
                } else if (coefficient < 0) {
                    sb.append(" - ");
                }

                coefficient = Math.abs(coefficient);
                if (i == 0 || coefficient != 1) {
                    sb.append(coefficient);
                }

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

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        int degree = degree();
        double[] derivativeCoefficients = new double[degree];

        for (int i = 0; i < degree; i++) {
            derivativeCoefficients[i] = coefficient(i) * (degree - i);
        }

        return derivativeCoefficients;
    }
}
