//package oop9.EX2_3;
//
//import java.util.Objects;
//
//public class AbstractPoly implements Poly {
//    public AbstractPoly() {
//    }
//    public double [] derive(){
//        if(this.degree() ==0 ){
//            return new double[]{0};
//        }
//        double [] deriveCoefficients = new double[this.degree()];
//        for (int i = 0; i < deriveCoefficients.length; i++) {
//            deriveCoefficients[i] = this.coefficient(i+1)*(i+1);//Dao ham b[i] = a[i] * [i+1]
//        }
//        return deriveCoefficients;
//    }
//    public boolean equals(Object poly2){
////        if(poly2 instanceof Poly){
////            if(((Poly) poly2).degree() != this.degree()){
////                return false;
////            }
////            for (int i = 0; i < this.degree(); i++) {
////                if(this.coefficient(i) != ((Poly) poly2).coefficient(i)){
////                    return false;
////                }
////            }
////            return true;
////        }
////        return true;
//        int hash1 = this.hashCode();
//        int hash2 = poly2.hashCode();
//        if(hash1 == hash2){
//            return true;
//        }
//        return false;
//    }
//    public int hashCode(){
//        return Objects.hash(this.coefficients());
//    }
//    public String toString(){
//        StringBuilder s = new StringBuilder();
//        s.append(this.coefficient(0));
//        for (int i = 0; i <= this.degree() ; i++) {
//            s.append(String.format(" + %fx^%d", this.coefficient(i), i));
//        }
//        return super.toString();
//    }
//
//    @Override
//    public double[] coefficients() {
//        return coefficients();
//    }
//
//    @Override
//    public double coefficient(int degree) {
//        return this.coefficient(degree);
//    }
//
//    @Override
//    public int degree() {
//        return this.coefficients().length-1;
//    }
//
//    @Override
//    public Poly derivative() {
//        return null;
//    }
//}
