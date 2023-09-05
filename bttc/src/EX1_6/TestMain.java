package EX1_6;

public class TestMain {
    public static void main(String[] args) {
        Cat  cat1 = new Cat("Shi");
        cat1.greets();

        Dog dog1 = new Dog("Pop");
        dog1.greets();

        BigDog bigDog1 = new BigDog("Bigpop");
        bigDog1.greets();
        bigDog1.greets(dog1);

        Animal animal1 = new Cat("db");
        animal1.greets();
        Animal animal2 = new Dog("mm");
        animal2.greets();
        Animal animal3 = new BigDog("Kk");
        animal3.greets();

        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Cat cat2 = (Cat)animal1;
        dog2.greets();
        bigDog2.greets();
        cat2.greets();
    }
}
