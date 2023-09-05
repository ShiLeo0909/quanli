package oop10.decorator.icecream;

public class NutsToppingDecorator extends ToppingDecorator{

    public NutsToppingDecorator(IceCream swappee) {
        super(swappee);
    }

    @Override
    public String getDescription() {
        return swappee.getDescription() + " " + "Nuts";
    }
}
