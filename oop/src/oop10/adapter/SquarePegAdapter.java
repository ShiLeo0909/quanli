package oop10.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter( SquarePeg peg) {
        super((int) (peg.getWidth() * Math.sqrt(2)/2));
        this.peg = peg;
    }
    @Override
    public int getRadius(){
        return (int)(peg.getWidth() * Math.sqrt(2)/2);
    }
}
