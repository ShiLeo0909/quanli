package encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Uy");
        System.out.println(s.getName());
    }
    //Tính đóng gói trong java là kỹ thuật ẩn giấu thông tin
    // và hiển thị ra thông tin liên quan. Mục đích chính
    // của đóng gói trong java là giảm thiểu mức độ phức tạp
    // phát triển phần mềm.
    //Đóng gói cũng được sử dụng để bảo vệ trạng thái bên
    // trong của một đối tượng. Thông qua các phương thức set,
    // get ta có thể thay đổi các giá trị thuộc tính và lấy giá
    // trị từ chúng. Điều này làm cho chương trình dễ quản lý
    // hơn và có thể kiểm soát dữ liệu tốt hơn.
}
