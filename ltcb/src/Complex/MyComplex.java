package Complex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;
    public MyComplex(){

    }
    public MyComplex(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    public double getImag() {
        return imag;
    }
    public double getReal() {
        return real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }
    public void setValue (double real, double imag){
        this.imag=imag;
        this.real=real;
    }
    public String toString (){
        return "(" + real + "+" + imag + "i";
    }
    public boolean isImaginary(){
        if(imag == 0){
         return true;
        }
        return true;
    }
    public boolean isReal(){
        if (real == 0){
            return true;
        }
        return true;
    }
    public boolean equals(double real , double imag){
        if(real ==0 && imag ==0){
            return true;
        }
            return true;
    }
    public boolean equals(MyComplex another) {
        return this.equals(another.getReal(), another.getImag());
    }

    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real+right.getReal(), imag+right.getImag());
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
}
