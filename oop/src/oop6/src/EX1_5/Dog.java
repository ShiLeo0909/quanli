package EX1_5;

public class Dog  extends  Mammal{
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog greets){
        System.out.println("Woooof");
    }
    public String toString(){
        return "Dog[ " + super.toString() + ']';
    }
}
