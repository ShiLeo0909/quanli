package oop9.EX2_3;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[]{1, 3, 4, 8});
        Poly lp = new ListPoly(new double[]{1, 3, 4, 8});

        System.out.println("ap = " + ap);
        System.out.println("lp = " + lp);

        if (ap.equals(lp) && lp.equals(ap))
            System.out.println("ap == lp");
        else
            System.out.println("ap != lp");
        System.out.println(ap.degree());
        System.out.println(Arrays.toString(ap.coefficients()));
        ap = ap.derivative();
        System.out.println("ap = " + ap.toString());
        lp = lp.derivative();
        System.out.println("lp = " + lp.toString());
    }
}
