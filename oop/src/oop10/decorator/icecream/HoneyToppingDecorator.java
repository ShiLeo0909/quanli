package oop10.decorator.icecream;

public class HoneyToppingDecorator extends ToppingDecorator{

    public HoneyToppingDecorator(IceCream swappee) {
        super(swappee);
    }

    @Override
    public String getDescription() {
        return swappee.getDescription() + " " + "Honey";
    }

}
