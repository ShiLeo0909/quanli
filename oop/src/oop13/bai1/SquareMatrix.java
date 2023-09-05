package oop13.bai1;

import java.util.Arrays;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoản [1, 100]g
     *
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    public SquareMatrix(int[][] data) {
        this.data = data;
    }


    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    private void initRandom(int size) {
        data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     *
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        int size = data.length;
        int[] diagonal = new int[size];
        for (int i = 0; i < size; i++) {
            diagonal[i] = data[i][i];
        }
        return diagonal;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     *
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        int size = data.length;
        int[] diagonal = new int[size];
        for (int i = 0; i < size; i++) {
            diagonal[i] = data[i][size - 1 - i];
        }
        return diagonal;
    }

    /**
     * Phương thức kiểm tra một số có phải là số nguyên tố hay không.
     *
     * @param number
     * @return true nếu là số nguyên tố, false nếu không phải số nguyên tố.
     */
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

/**
 * Phương thức lấy ra các số là số nguyên tố trong ma trận.
 * @return các số nguyên tố trong ma trận.
 */
public int[] primes() {
    int size = data.length;
    int count = 0;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (isPrime(data[i][j])) {
                count++;
            }
        }
    }
    int[] primeNumbers = new int[count];
    int index = 0;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (isPrime(data[i][j])) {
                primeNumbers[index] = data[i][j];
                index++;
            }
        }
    }
    return primeNumbers;
}

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        int size = data.length;
        int[][] sortedData = new int[size][size];
        for (int i = 0; i < size; i++) {
            sortedData[i] = Arrays.copyOf(data[i], size);
            Arrays.sort(sortedData[i]);
        }
        return new SquareMatrix(sortedData);
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return giá trị phần tử ở vị trí (row, col).
     */
    public int get(int row, int col) {
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        int size = data.length;
        int[][] sumData = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumData[i][j] = data[i][j] + that.get(i, j);
            }
        }
        return new SquareMatrix(sumData);
    }
    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that Ma trận trừ
     * @return Ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        int size = data.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = this.data[i][j] - that.data[i][j];
            }
        }
        return new SquareMatrix(result);
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that Ma trận nhân
     * @return Ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        int size = data.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += this.data[i][k] * that.data[k][j];
                }
            }
        }
        return new SquareMatrix(result);
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value Số vô hướng
     * @return Ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        int size = data.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = this.data[i][j] * value;
            }
        }
        return new SquareMatrix(result);
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return Ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        int size = data.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = this.data[j][i];
            }
        }
        return new SquareMatrix(result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            for (int element : row) {
                sb.append(element).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
