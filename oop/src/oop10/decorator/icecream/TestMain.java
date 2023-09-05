package oop10.decorator.icecream;

public class TestMain {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateIceCream();
        System.out.println(iceCream.getDescription());

        IceCream honeyIcecrem = new HoneyToppingDecorator(iceCream);
        System.out.println(honeyIcecrem.getDescription());
    }
}
