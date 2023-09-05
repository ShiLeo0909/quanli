package polymorphism;

public class Test {
    public static void main(String[] args) {
        //Tính đa hình là khả năng một đối tượng có thể thực hiện một tác vụ theo nhiều cách khác nhau
        //Tính đa hình (polymorphism) trong Java là khả năng của một đối tượng
        // có thể có nhiều hình dạng (kiểu dữ liệu) khác nhau và có thể thực hiện
        // các hành vi (phương thức) khác nhau tương thích với từng hình dạng đó,
        // mà không cần biết chính xác kiểu dữ liệu của đối tượng đó là gì.
        //Trong ngữ cảnh của ghi đè (overriding), tính đa hình cho phép lớp con
        // (subclass) ghi đè (override) phương thức của lớp cha (superclass) để t
        // hay đổi hoặc mở rộng hành vi của phương thức đó, trong khi vẫn duy trì
        // tên phương thức, kiểu dữ liệu của tham số và giá trị trả về giống nhau.
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.sound();
        animal2.sound();


        //Kết Quả
        //Gow Gow
        //Meo Meo



    }
}
