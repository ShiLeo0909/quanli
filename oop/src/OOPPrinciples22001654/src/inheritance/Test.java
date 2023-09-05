package inheritance;

public class Test {
    public static void main(String[] args) {
        //Kế thừa trong java là sự liên quan giữa hai class với nhau,
        // trong đó có class cha (superclass) và class con (subclass).
        // Khi kế thừa class con được hưởng tất cả các phương thức và
        // thuộc tính của class cha. Tuy nhiên, nó chỉ được truy cập
        // các thành viên public và protected của class cha.
        // Nó không được phép truy cập đến thành viên private của class cha.
        Boy b = new Boy("Uy");
        System.out.println(b.isGender());//Hàm con kế thừa phương thức isGender() của lớp cha
        System.out.println(b.Speak());   //Hàm con kế thừa phương thức Speak() của lớp cha
        System.out.println(b.getName()); //Hàm con kế thừa phương thức getName() của lớp cha

        //Kết Quả Phương Trình Chạy
        //true
        //Hello
        //null
    }
}
