package abstraction;

public class Boy extends Person {

    public Boy(String name, int age, float height) {
        super(name, age, height);
    }


    @Override

    public String Speak() {
        return "Hello Word";
    }//Phương thức trừu tượng Speak() được ghi đè bởi lớp con kết thừa lớp cha

    @Override
    public String Learn() {//Phương thức trừu tượng Speak() được ghi đè bởi lớp con kết thừa lớp cha
        return "learn the alphabet";
    }
}
