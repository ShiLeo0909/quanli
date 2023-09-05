package frameworkjava;

import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        System.out.println("Định nghĩa");
        // PriorityQueue là một lớp cài đặt của hàng đợi ưu tiên.
        // Nó được sử dụng để lưu trữ các phần tử có thứ tự theo một giá trị ưu tiên,
        // và có thể được sử dụng để lấy ra phần tử có giá trị ưu tiên cao nhất hoặc thêm một phần tử mới với giá trị ưu tiên được xác định.
        System.out.println("Trường hợp nên dùng priorityQueue");
        //Xử lý dữ liệu với độ ưu tiên: PriorityQueue có thể được sử dụng để lưu trữ các phần tử có độ ưu tiên khác nhau và xử lý
        // chúng theo thứ tự ưu tiên. Ví dụ: Xác định top k phần tử lớn nhất hoặc nhỏ nhất của một danh sách.
        //
        //Giải quyết các bài toán tìm kiếm đường đi ngắn nhất: PriorityQueue có thể được sử dụng để lưu trữ các đỉnh trong đồ thị và
        // sắp xếp chúng theo khoảng cách từ đỉnh bắt đầu. Khi xử lý đỉnh, chúng ta chỉ cần lấy ra đỉnh có khoảng cách ngắn nhất và
        // cập nhật lại khoảng cách của các đỉnh kề với đỉnh này.
        //
        //Xử lý các tác vụ có độ ưu tiên khác nhau: PriorityQueue có thể được sử dụng để xử lý các tác vụ với độ ưu tiên khác nhau,
        // chẳng hạn như xử lý các tác vụ theo thứ tự ưu tiên cao nhất, nhưng vẫn đảm bảo các tác vụ ưu tiên thấp hơn sẽ được xử lý trong thời gian hợp lý.
        //
        //Sắp xếp dữ liệu: PriorityQueue có thể được sử dụng để sắp xếp dữ liệu, nhưng nó không phải là phương pháp sắp xếp chính thức trong Java.
        // Nếu bạn cần sắp xếp các phần tử trong danh sách của mình, hãy sử dụng phương thức sort () trong lớp Arrays hoặc Collections.
        System.out.println("Ưu Điểm");
        //Được triển khai dưới dạng heap, giúp đảm bảo tính toàn vẹn của dữ liệu.
        //Thời gian thực hiện của các phương thức chèn và lấy phần tử ra khỏi hàng đợi là O(log n), do đó sắp xếp và xử lý dữ liệu nhanh chóng.
        //PriorityQueue hỗ trợ các phương thức để xóa phần tử khỏi hàng đợi, tìm kiếm phần tử,
        // tìm kích thước của hàng đợi, kiểm tra hàng đợi có trống hay không.
        //PriorityQueue có thể được sử dụng để giải quyết các vấn đề như xác định top k phần tử lớn nhất hoặc nhỏ nhất của một danh sách.
        System.out.println("Nhược Điểm");
        //Không cho phép truy cập ngẫu nhiên vào các phần tử: PriorityQueue chỉ cho phép truy cập vào phần tử ở đầu hàng đợi
        // (đối với phần tử có độ ưu tiên cao nhất), và không cho phép truy cập ngẫu nhiên vào các phần tử khác trong hàng đợi.
        // Điều này có thể làm giảm tính linh hoạt và đa dạng của ứng dụng sử dụng PriorityQueue.
        //
        //Không thể đảo ngược thứ tự ưu tiên: Vì PriorityQueue sử dụng heap để triển khai, thứ tự ưu tiên của các phần tử
        // sẽ được xác định bởi cấu trúc heap. Điều này có nghĩa là không thể đảo ngược thứ tự ưu tiên của các phần tử trong hàng đợi một cách dễ dàng.
        //
        //Chiếm dụng không gian lớn: Trong một số trường hợp, PriorityQueue có thể chiếm dụng không gian lớn hơn so với các cấu trúc dữ liệu khác,
        // đặc biệt là khi hàng đợi chứa nhiều phần tử. Điều này có thể ảnh hưởng đến hiệu suất và tốc độ của ứng dụng.
        //
        //Khó kiểm soát việc đối xử với các phần tử trùng lặp: Trong PriorityQueue, các phần tử trùng lặp không được phép và sẽ bị loại bỏ khi
        // được chèn vào hàng đợi. Tuy nhiên, việc kiểm soát việc đối xử với các phần tử trùng lặp có thể gây ra một số khó khăn cho người lập trình.
        PriorityQueue<Integer> pq = new PriorityQueue<>(5);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.offer(5);
        pq.offer(15);

        System.out.println("Lay ra phan tu dau tien :" + pq.peek());
        System.out.println("In ra cac pha tu ");
        for (int element : pq) {
            System.out.println(element);
        }
        System.out.println("Is PriorityQueue empty? " + pq.isEmpty());

        // Thêm các phần tử vào PriorityQueue
        pq.add(100);
        pq.add(50);

        // Chuyển đổi PriorityQueue thành một mảng
        Integer[] arr = pq.toArray(new Integer[0]);
        System.out.print("Array from PriorityQueue: ");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }

        // Xóa tất cả các phần tử trong PriorityQueue
        pq.clear();
        System.out.println("\nElements after clear: " + pq);

        System.out.println("các phương thức trong java");
        //add(E e): Thêm một phần tử vào PriorityQueue.
        //
        //offer(E e): Tương tự như phương thức add(), nhưng nếu không có đủ không gian trong PriorityQueue để chứa phần tử mới,
        // phương thức offer() sẽ trả về giá trị false thay vì ném ra ngoại lệ.
        //
        //remove(): Xóa và trả về phần tử đầu tiên trong PriorityQueue.
        //
        //poll(): Lấy và xóa phần tử đầu tiên trong PriorityQueue, nếu không có phần tử nào, phương thức sẽ trả về null.
        //
        //peek(): Trả về phần tử đầu tiên trong PriorityQueue mà không xóa nó, nếu không có phần tử nào, phương thức sẽ trả về null.
        //
        //size(): Trả về số lượng phần tử hiện có trong PriorityQueue.
        //
        //isEmpty(): Kiểm tra xem PriorityQueue có rỗng hay không.
        //
        //toArray(): Chuyển các phần tử trong PriorityQueue thành một mảng.
        //
        //clear(): Xóa tất cả các phần tử trong PriorityQueue.
    }
}
