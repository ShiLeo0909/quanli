package oop11.factory.fruit;

public class NorthFruitFactory implements FruitFactory {
    @Override
    public Fruit provideFruit(String type) {
        if(type.equals("Banana")){
            return  new Banana();
        }
        if(type.equals("Apple")){
             return new Apple();
        }
        if(type.equals("Orange")){
            return new Orange();
        }
        return null;
    }
}
