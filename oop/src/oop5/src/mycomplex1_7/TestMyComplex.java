package mycomplex1_7;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(1.1, 2.2);
        System.out.println("Number 1 is "+ complex1);
        System.out.println(complex1 + " is "+(complex1.isReal() ? "" : "NOT")+" pure real number");
        System.out.println(complex1 + " is "+(complex1.isImaginary() ? "" : "NOT")+" pure imaginary number");

        MyComplex complex2 = new MyComplex(3.3, 4.4);
        System.out.println("Number 2 is "+ complex2);
        System.out.println(complex2 + " is "+(complex2.isReal() ? "" : "NOT")+" pure real number");
        System.out.println(complex2 + " is "+(complex2.isImaginary() ? "" : "NOT")+" pure imaginary number");

        System.out.println(complex1+" is " +(complex1.equals(complex2) ? "":"NOT") +" equal to "+complex2);
        System.out.println(complex1+" + "+complex2+" = "+complex1.addInto(complex2));
        System.out.println(complex1+" - "+complex2+" = "+complex1.subtract(complex2));
    }
}
