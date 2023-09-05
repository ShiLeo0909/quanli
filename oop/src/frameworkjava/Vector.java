package frameworkjava;

public class Vector {
    public static void main(String[] args) {
        System.out.println("Ưu Điểm");
        //Vector trong Java là một cấu trúc dữ liệu dùng để lưu trữ các đối tượng tương tự như ArrayList,
        // tuy nhiên nó được đồng bộ hóa (synchronized) để đảm bảo an toàn cho đa luồng. Vector được triển khai dựa trên mảng, tương tự như ArrayList.
        //
        //Đồng bộ hóa: Vector được đồng bộ hóa, điều này đảm bảo rằng nó là an toàn để sử dụng trong môi trường đa luồng.
        // Việc đồng bộ hóa giúp tránh xảy ra lỗi cùng lúc nhiều luồng truy cập vào cùng một phần tử, tránh xảy ra lỗi đọc/ghi dữ liệu không đồng bộ.
        //
        //Kích thước động: Vector cũng có khả năng mở rộng kích thước của mình,
        // tùy thuộc vào số lượng phần tử trong nó. Điều này giúp tối ưu hóa việc sử dụng bộ nhớ.
        //
        //Thao tác thêm và xóa: Vector cung cấp các phương thức để thêm, xóa, chèn các phần tử vào trong Vector, giống như ArrayList.
        //
        //Truy xuất phần tử: Vector cũng cung cấp các phương thức để truy xuất các phần tử trong Vector, giống như ArrayList.
        //
        //Tương thích ngược: Vector là một lớp cũ hơn trong Java, do đó nó tương thích với các phiên bản Java cũ hơn,
        // điều này hữu ích cho việc phát triển phần mềm cũ.
        System.out.println("Nhược Điểm");
        //Hiệu suất không tốt: Vector được đồng bộ hóa, điều này ảnh hưởng đến hiệu suất của nó.
        // Vector không phải là cấu trúc dữ liệu hiệu quả nhất trong trường hợp đa luồng (multi-threading).
        //
        //Tăng kích thước mảng: Khi một Vector bị đầy, mảng dữ liệu sẽ được tăng kích thước.
        // Quá trình này có thể tốn kém và làm giảm hiệu suất của ứng dụng.
        //
        //Chỉ hỗ trợ truy cập tuần tự: Vector chỉ hỗ trợ truy cập tuần tự thông qua các phần tử liên tiếp.
        // Việc truy cập ngẫu nhiên hoặc truy xuất với chỉ số không phải số nguyên sẽ tốn nhiều thời gian hơn
        // so với các cấu trúc dữ liệu khác như TreeMap, HashSet hay HashMap.
        //
        //Không hỗ trợ lập chỉ mục: Vector không hỗ trợ lập chỉ mục (indexing),
        // điều này làm giảm khả năng sử dụng của nó trong một số trường hợp.
        //
        //Thiếu tính linh hoạt: Vector không hỗ trợ một số tính năng linh hoạt như Iterator,
        // nên có thể gây khó khăn trong việc lặp qua các phần tử của nó.
    }
}
