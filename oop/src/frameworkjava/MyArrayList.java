package frameworkjava;

public class MyArrayList {
    public static void main(String[] args) {
        System.out.println("Ưu Điểm");
        //Truy cập nhanh: ArrayList được triển khai dựa trên mảng nên việc
        // truy cập các phần tử trong ArrayList là nhanh chóng và hiệu quả.
        //
        //Tăng kích thước tự động: ArrayList có thể tự động tăng kích thước của mình khi cần thiết
        // để chứa thêm các phần tử mới. Việc này giúp tránh tình trạng tràn bộ nhớ.
        //
        //Có thể chứa các phần tử trùng lặp: ArrayList cho phép lưu trữ các phần tử trùng lặp,
        // nó không giới hạn số lượng các phần tử được chứa trong ArrayList.
        //
        //Hỗ trợ các phương thức tiện ích của Collection: ArrayList hỗ trợ các phương thức
        // tiện ích của Collection như add(), remove(), clear() và contains().
        //
        //Dễ dàng sử dụng: ArrayList là một trong những lớp cơ bản nhất trong Java,
        // nó rất dễ sử dụng và đơn giản để triển khai.
        System.out.println("Nhược Điểm" );
        //Chậm khi thêm hoặc xóa phần tử: Khi thêm hoặc xóa một phần tử ở giữa danh sách,
        // ArrayList phải di chuyển các phần tử còn lại để giải phóng chỗ cho phần tử mới
        // hoặc xóa phần tử cũ. Điều này có thể dẫn đến hiệu năng chậm hơn so với các cấu trúc dữ liệu khác như LinkedList.
        //
        //Cần tốn nhiều không gian để lưu trữ các phần tử trống:
        // ArrayList cần phải dành một khối lượng bộ nhớ liên tục để lưu trữ các phần tử của nó. Nếu số phần tử trong danh sách thay đổi thường xuyên, ArrayList sẽ phải thực hiện việc cấp phát và giải phóng bộ nhớ thường xuyên, dẫn đến hiệu suất chậm hơn.
        //
        //Không thích hợp cho các thao tác truy xuất ngẫu nhiên: Truy xuất một phần tử ở vị trí bất kỳ trong danh sách bằng cách sử dụng phương thức get() trong ArrayList sẽ yêu cầu thời gian xử lý đồng đều với số lượng phần tử trong danh sách. Điều này làm cho nó không thích hợp cho các thao tác truy xuất ngẫu nhiên trên danh sách lớn.
        //
        //Không đảm bảo an toàn cho đa luồng: ArrayList không được đồng bộ hóa, do đó không đảm bảo an toàn cho đa luồng. Nếu nhiều thread cùng truy cập và thay đổi ArrayList, có thể dẫn đến các lỗi không mong muốn như lỗi race condition hoặc lỗi truy cập đồng thời (concurrent access).
    }
}
