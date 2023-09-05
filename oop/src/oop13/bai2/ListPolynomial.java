package oop13.bai2;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        if (index < 0 || index >= coefficients.size()) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] arr = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            arr[i] = coefficients.get(i);
        }
        return arr;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index > coefficients.size()) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Xóa phần tử trong đa thức tại vị trí index.
     * @param index vị trí của phần tử cần xóa.
     * @return đa thức hiện tại.
     */
    public ListPolynomial remove(int index) {
        if (index < 0 || index >= coefficients.size()) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        coefficients.remove(index);
        return this;
    }
    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index >= coefficients.size()) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        if (coefficients.isEmpty()) {
            return 0;
        }
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double value = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            double coefficient = coefficients.get(i);
            value += coefficient * Math.pow(x, i);
        }
        return value;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        ListPolynomial derivative = new ListPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            double coefficient = coefficients.get(i) * i;
            derivative.append(coefficient);
        }
        return derivative;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        int maxLength = Math.max(coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient1 = (i < coefficients.size()) ? coefficients.get(i) : 0;
            double coefficient2 = (i < another.coefficients.size()) ? another.coefficients.get(i) : 0;
            result.append(coefficient1 + coefficient2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        int maxLength = Math.max(coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient1 = (i < coefficients.size()) ? coefficients.get(i) : 0;
            double coefficient2 = (i < another.coefficients.size()) ? another.coefficients.get(i) : 0;
            result.append(coefficient1 - coefficient2);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        int maxLength = coefficients.size() + another.coefficients.size() - 1;
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient = 0;
            for (int j = 0; j <= i; j++) {
                if (j < coefficients.size() && (i - j) < another.coefficients.size()) {
                    coefficient += coefficients.get(j) * another.coefficients.get(i - j);
                }
            }
            result.append(coefficient);
        }
        return result;
    }
}
