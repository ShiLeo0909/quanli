package mycomplex1_7;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double imag, double real) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "real+imagi" + real + "+" + imag + "i" ;
    }

    public boolean isReal() {
        if (imag == 0) ;
        return true;
    }

    public boolean isImaginary() {
        if (real == 0) ;
        return true;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) ;
        return true;
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.real && this.imag == another.imag) ;
        return true;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }
    public MyComplex addInto(MyComplex right){
        real = right.real + real;
        imag = right.imag + imag;
        return this;
    }

    public MyComplex addNew (MyComplex right){
        return new MyComplex(real+ right.real , imag+right.imag);
    }
    public MyComplex subtract (MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew (MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }
    public MyComplex multiply (MyComplex right) {
        real = this.real * right.real - this.imag * right.imag;
        imag = this.real * right.imag + this.imag * right.real;
        this.real = real;
        this.imag = imag;
        return this;
    }
    public MyComplex divide(MyComplex right) {
        MyComplex tmp = multiply(right.conjugate());
        double delimiter = right.getReal()*right.getReal() + right.getImag()*right.getImag();
        if (delimiter != 0) {
            real = tmp.getReal() / delimiter;
            imag = tmp.getImag() / delimiter;
        }
        return this;
    }
    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

}
