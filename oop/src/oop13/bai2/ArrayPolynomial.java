package oop13.bai2;

import java.util.Arrays;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficients;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        coefficients = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] copy = new double[size];
        System.arraycopy(coefficients, 0, copy, 0, size);
        return copy;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        int currentDegree = degree();
        if (size == coefficients.length) {
            enlarge();
        }

        // Xác định bậc của phần tử cuối
        int newDegree = currentDegree + 1;

        // Kiểm tra nếu bậc của phần tử cuối lớn hơn phần tử trước 1 bậc
        if (newDegree > 0 && Math.abs(coefficient) < 1e-10) {
            throw new IllegalArgumentException("Invalid coefficient. The degree of the new term should be higher than the previous term.");
        }

        // Thêm phần tử vào cuối đa thức
        coefficients[size++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        if (size == coefficients.length) {
            enlarge();
        }
        System.arraycopy(coefficients, index, coefficients, index + 1, size - index);
        coefficients[index] = coefficient;
        size++;
        return this;
    }
    /**
     * Xóa phần tử trong đa thức tại vị trí index.
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }

        System.arraycopy(coefficients, index + 1, coefficients, index, size - index - 1);
        size--;

        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        if (size == 0) {
            return 0;
        }
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double value = 0;
        for (int i = 0; i < size; i++) {
            value += coefficients[i] * Math.pow(x, i);
        }
        return value;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < size; i++) {
            double coefficient = coefficients[i] * i;
            derivative.append(coefficient);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        int maxLength = Math.max(size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient1 = (i < size) ? coefficients[i] : 0;
            double coefficient2 = (i < another.size) ? another.coefficients[i] : 0;
            result.append(coefficient1 + coefficient2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        int maxLength = Math.max(size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient1 = (i < size) ? coefficients[i] : 0;
            double coefficient2 = (i < another.size) ? another.coefficients[i] : 0;
            result.append(coefficient1 - coefficient2);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
        int maxLength = size + another.size - 1;
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient = 0;
            for (int j = 0; j <= i; j++) {
                if (j < size && (i - j) < another.size) {
                    coefficient += coefficients[j] * another.coefficients[i - j];
                }
            }
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        int newCapacity = coefficients.length * 2;
        coefficients = Arrays.copyOf(coefficients, newCapacity);
    }
}
