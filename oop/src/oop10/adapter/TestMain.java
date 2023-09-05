package oop10.adapter;

import java.util.Random;

public class TestMain {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg ( 5 );
        System.out.println(hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg ( 5 );
        SquarePeg largeSquarePeg = new SquarePeg ( 10);
        SquarePegAdapter squarePegAdaptersmall = new SquarePegAdapter( smallSquarePeg);
        SquarePegAdapter squarePegAdapterlarge = new SquarePegAdapter( largeSquarePeg);
        System.out.println(hole.fits(squarePegAdaptersmall));
        System.out.println(hole.fits(squarePegAdapterlarge));
    }
}
