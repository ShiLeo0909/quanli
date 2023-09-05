package EX1_5;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Marco");
        System.out.println(animal);

        Mammal mammal = new Mammal("Mah");
        System.out.println(mammal.toString());

        Dog dog = new Dog("Cho");
        dog.greets();
        System.out.println(dog.toString());

        Cat cat = new Cat("meo");
        cat.greets();
        System.out.println(cat.toString());
    }
}
