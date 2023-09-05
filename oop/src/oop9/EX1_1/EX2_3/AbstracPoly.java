package oop9.EX1_1.EX2_3;

import java.util.Objects;

public abstract class AbstracPoly implements Poly{
    public AbstracPoly(){

    }
    public double[] derive(){
        if(this.degree() == 0){
            return new double[] {0};
        }
        double[] dervieCoefficents = new double[this.degree()];
        for (int i = 0; i < dervieCoefficents.length; i++) {
            dervieCoefficents[i] = this.coefficient(i + 1) * (i + 1);
        }
        return dervieCoefficents;
    }
    public boolean equals(Object poly2) {
        if (poly2 instanceof Poly) {
            if (((Poly) poly2).degree() != this.degree()) {
                return false;
            }
            for (int i = 0; i < this.degree(); i++) {
                if (this.coefficient(i) != ((Poly) poly2).coefficient(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(this.coefficients());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(coefficient(0));
        for (int i = 1; i <= degree(); i++) {
            s.append(String.format(" + %.3fx^%d",this.coefficient(i),i));
        }
        return s.toString();
    }
}
