package frameworkjava;

public class Stack {
    public static void main(String[] args) {
        System.out.println("Ưu Điểm");
        //Đơn giản và dễ hiểu: Stack là một cấu trúc dữ liệu đơn giản và dễ hiểu, vì nó là một danh sách các phần tử được lưu trữ theo trình tự LIFO (Last In First Out). Do đó, việc sử dụng stack là rất dễ hiểu và tiện lợi cho các lập trình viên.
        //
        //Thời gian truy cập nhanh: Các phần tử được thêm vào stack và lấy ra từ stack đều ở đầu stack, do đó thời gian truy cập vào các phần tử này là rất nhanh.
        //
        //Tính linh hoạt cao: Cấu trúc dữ liệu Stack rất linh hoạt và có thể được sử dụng trong nhiều tình huống khác nhau, ví dụ như trong việc tìm kiếm đệ quy, xử lý bài toán đóng mở ngoặc, lưu trữ trạng thái tạm thời của ứng dụng và nhiều tình huống khác.
        //
        //Bảo mật dữ liệu: Cấu trúc dữ liệu Stack cung cấp tính năng bảo mật dữ liệu, do đó các phần tử được lưu trữ trong stack chỉ có thể được truy cập thông qua các phương thức được cung cấp bởi stack, và không thể truy cập trực tiếp.
        //
        //Tính tái sử dụng cao: Các phần tử trong stack có thể được lấy ra và sử dụng lại trong nhiều tình huống khác nhau, do đó stack giúp tiết kiệm bộ nhớ và tăng tính tái sử dụng của các phần tử
        System.out.println("Nhược Điểm");
        //Giới hạn kích thước: Stack có kích thước giới hạn, do đó nếu số lượng phần tử vượt quá kích thước của stack thì sẽ gây ra lỗi tràn bộ nhớ (stack overflow).
        //
        //Không hỗ trợ truy cập ngẫu nhiên: Các phần tử trong stack chỉ có thể được truy cập theo trình tự LIFO, nghĩa là chỉ có thể lấy ra phần tử cuối cùng mà không thể truy cập đến các phần tử ở vị trí khác.
        //
        //Không hỗ trợ xóa phần tử tại vị trí bất kỳ: Stack không hỗ trợ xóa phần tử tại vị trí bất kỳ, do đó nếu muốn xóa phần tử ở vị trí bất kỳ, cần phải lấy ra tất cả các phần tử ở trên nó trước đó.
        //
        //Khó sử dụng trong một số tình huống: Cấu trúc dữ liệu Stack không phù hợp cho việc sử dụng trong một số tình huống, ví dụ như khi cần truy cập các phần tử theo thứ tự ngược lại (FIFO - First In First Out), hoặc khi cần phải truy cập các phần tử ở vị trí bất kỳ.
        //
        //Độ phức tạp của một số phép toán: Một số phép toán trên Stack có độ phức tạp khá cao, đặc biệt là khi thực hiện các phép toán liên quan đến tìm kiếm hoặc sắp xếp các phần tử trong Stack
        //push(): Thêm một phần tử mới vào đầu Stack.
        //
        //pop(): Lấy ra phần tử ở đầu Stack.
        //
        //peek(): Truy cập phần tử ở đầu Stack mà không xóa nó khỏi Stack.
        //
        //isEmpty(): Kiểm tra xem Stack có rỗng không.
        //
        //isFull(): Kiểm tra xem Stack có đầy không (nếu Stack có kích thước giới hạn).
        //
        //size(): Trả về số lượng phần tử hiện tại của Stack.
    }
}
