package encapsulation;

public class Student {
    //sử dụng private để bảo vệ dữ liệu
    //khai báo biến truy cập là private thì chỉ
    //trong lớp mới có thể nhìn thấy được
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
