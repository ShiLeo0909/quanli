package oop10.decorator.icecream;

public abstract class ToppingDecorator implements IceCream{
    protected IceCream swappee;

    public ToppingDecorator(IceCream swappee) {
        this.swappee = swappee;
    }
}
