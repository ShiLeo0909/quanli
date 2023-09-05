package oop.week07;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
            int[] a = null;
            System.out.println(a.length);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("lỗi");
        } finally { // luôn chạy dù lỗi hay không
            System.out.println("đây là finally");
        }
        // trong try là khối lệnh có thể gây lỗi
        // trong catch là khối lệnh xử lý nếu gặp lỗi
        System.out.println(6 / 2);
    }
}
