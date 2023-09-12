package homework1.bai3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Complex complex1 = Complex.input();
        Complex complex2 = Complex.input();
        System.out.println(complex1);
        System.out.println(complex1.add(complex2));
        System.out.println(complex1.multiplication(complex1));
    }
}
