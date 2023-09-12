package homework1.bai3;

import java.util.Scanner;

public class Complex {
    private int real;
    private int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
    }

    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setVirtual(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        if (image == 0) {
            return "complexNumbers{" +
                    +real +
                    '}';
        } else if (real == 0) {
            return "complexNumbers{" +
                    +image + "i" +
                    '}';
        } else if (image > 0) {
            return "complexNumbers{" +
                    +real +
                    "+" + image + "i" +
                    '}';
        } else if (image < 0) {
            return "complexNumbers{" +
                    +real +
                    +image + "i" +
                    '}';
        }
        return null;
    }

    public static Complex input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real numbers");
        int real = sc.nextInt();
        System.out.println("Enter virtual number");
        int image = sc.nextInt();
        return new Complex(real, image);
    }

    public Complex add(Complex another) {
        int addReal = this.real + another.getReal();
        int addImage = this.image + another.getImage();
        return new Complex(addReal, addImage);
    }

    public Complex minus(Complex another) {
        return this.add(another.multiplication(new Complex(-1, 0)));
    }

    public Complex multiplication(Complex another) {
        int multiplicationReal = this.real * another.getReal() - this.image * getImage();
        int mumultiplicationVirtual = this.real * another.getImage() + this.image * getReal();
        return new Complex(multiplicationReal, mumultiplicationVirtual);
    }
}
