package oop13.bai1;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5,10); // Kích thước ma trận

        // Tạo ra 2 ma trận ngẫu nhiên
        SquareMatrix matrix1 = new SquareMatrix(size);
        SquareMatrix matrix2 = new SquareMatrix(size);


        // In ra 2 ma trận và 2 ma trận chuyển vị tương ứng
        System.out.println("Matrix 1:\n" + matrix1);
        System.out.println("Transpose of Matrix 1:\n" + matrix1.transpose().toString());
        System.out.println("Matrix 2:\n" + matrix2);
        System.out.println("Transpose of Matrix 2:\n" + matrix2.transpose().toString());

        // In ra các đường chéo chính và đường chéo phụ của 2 ma trận
        System.out.println("Main diagonal of Matrix 1: " + Arrays.toString(matrix1.principalDiagonal()));
        System.out.println("Secondary diagonal of Matrix 1: " + Arrays.toString(matrix1.secondaryDiagonal()));
        System.out.println("Main diagonal of Matrix 2: " + Arrays.toString(matrix2.principalDiagonal()));
        System.out.println("Secondary diagonal of Matrix 2: " + Arrays.toString(matrix2.secondaryDiagonal()));

        // In ra ma trận tổng của 2 ma trận
        SquareMatrix sumMatrix = matrix1.add(matrix2);
        System.out.println("Sum Matrix:\n" + sumMatrix);

        // In ra ma trận hiệu của ma trận thứ nhất cho ma trận thứ hai
        SquareMatrix diffMatrix = matrix1.minus(matrix2);
        System.out.println("Difference Matrix:\n" + diffMatrix);

        // In ra ma trận tích của 2 ma trận
        SquareMatrix productMatrix = matrix1.multiply(matrix2);
        System.out.println("Product Matrix:\n" + productMatrix);

        // In ra các số nguyên tố trong 2 ma trận
        System.out.println("Prime numbers in Matrix 1: " + Arrays.toString(matrix1.primes()));
        System.out.println("Prime numbers in Matrix 2: " + Arrays.toString(matrix2.primes()));

    }
}
