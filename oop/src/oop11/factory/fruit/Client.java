package oop11.factory.fruit;

public class Client {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new NorthFruitFactory();
        Fruit banana = fruitFactory.provideFruit("Banana");
        banana.produceJuice();
    }
}
