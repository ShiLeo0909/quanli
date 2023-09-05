package abstraction;

public class Test {
    public static void main(String[] args) {
        //Tính trừu tượng trong Java là tính chất không thể hiện cụ thể mà chỉ nêu tên vấn đề.
        // Đó là một quá trình che giấu các hoạt động bên trong và chỉ hiển thị những tính
        // năng thiết yếu của đối tượng tới người dùng.
        Boy b = new Boy("Uy" , 18 , 1.7f);
        System.out.println(b.Learn());//Phương thức bị ghi đè bởi class con
        System.out.println(b.Speak());//Phương thức bị ghi đè bởi class con

        //Kết Quả
        //learn the alphabet
        //Hello Word
    }
}
