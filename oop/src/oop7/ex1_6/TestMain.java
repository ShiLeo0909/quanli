package oop7.ex1_6;

public class TestMain {
    public static void main(String[] args) {
        Animal  animal1 = new Cat("Meo");

        Cat cat = (Cat) animal1;
        animal1.greets();

        Animal animal2 = new Dog("Thuc");

        Dog dog1 = (Dog) animal2;
        dog1.greets();
        dog1.greets(dog1);

        Animal animal3 = new BigDog("Pho");

        BigDog bigDog = (BigDog) animal3;
        animal3.greets();
        bigDog.greets(dog1);
        bigDog.greets(bigDog);
    }
}
