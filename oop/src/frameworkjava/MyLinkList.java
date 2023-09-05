package frameworkjava;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkList {
    public static void main(String[] args) {
        System.out.println("Linkedlist là tập không đồng bộ ");
        //add(element): thêm một phần tử vào cuối danh sách LinkedList.
        //add(index, element): thêm một phần tử vào vị trí chỉ định trong danh sách LinkedList.
        //addFirst(element): thêm một phần tử vào đầu danh sách LinkedList.
        //addLast(element): thêm một phần tử vào cuối danh sách LinkedList.
        //remove(index): xóa phần tử ở vị trí chỉ định trong danh sách LinkedList.
        //removeFirst(): xóa phần tử đầu tiên trong danh sách LinkedList.
        //removeLast(): xóa phần tử cuối cùng trong danh sách LinkedList.
        //get(index): lấy phần tử tại vị trí chỉ định trong danh sách LinkedList.
        //set(index, element): thay đổi giá trị của phần tử tại vị trí chỉ định trong danh sách LinkedList.
        //clear(): xóa toàn bộ nội dung của danh sách LinkedList.
        //size(): trả về số lượng phần tử trong danh sách LinkedList.
        //isEmpty(): kiểm tra xem danh sách LinkedList có rỗng hay không.
        System.out.println("So sánh LinkedList và ArrayList");
        //LinkedList là một cấu trúc dữ liệu đặc biệt trong Java Collection Framework,
        // nó cung cấp một số phương thức đặc biệt mà các cấu trúc dữ liệu khác như ArrayList không có.
        // Dưới đây là một số phương thức đặc biệt của LinkedList và ưu điểm của chúng:
        //addFirst() và addLast(): Phương thức này cho phép thêm một phần tử vào đầu hoặc cuối
        // của LinkedList một cách nhanh chóng. Điều này làm cho LinkedList thực hiện tốt hơn so
        // với ArrayList trong việc thêm phần tử vào đầu hoặc cuối danh sách, bởi vì trong ArrayList
        // thêm phần tử vào đầu danh sách là một thao tác tốn kém.
        //getFirst() và getLast(): Phương thức này trả về phần tử đầu tiên và phần tử cuối cùng
        // trong LinkedList một cách nhanh chóng.
        //removeFirst() và removeLast(): Phương thức này cho phép xóa phần tử đầu tiên hoặc cuối
        // cùng của LinkedList một cách nhanh chóng.
        //get(index): Phương thức này cho phép truy cập phần tử ở chỉ mục thứ i trong LinkedList.
        // Tuy nhiên, việc truy cập này sẽ tốn kém hơn so với ArrayList do LinkedList không có
        // cơ chế tìm kiếm nhanh.
        //add(index, element): Phương thức này cho phép chèn một phần tử vào vị trí index trong
        // LinkedList. Tuy nhiên, việc chèn này sẽ tốn kém hơn so với ArrayList do LinkedList cần
        // phải dùng iterator để duyệt tới vị trí cần chèn.
        //Tóm lại, LinkedList có thể làm được nhiều thứ hơn so với ArrayList, nhưng đôi khi các thao tác với LinkedList cũng tốn kém hơn. Do đó, khi lựa chọn cấu trúc dữ liệu, ta cần cân nhắc các yếu tố như tính tương thích, hiệu suất và tính linh hoạt để chọn ra cấu trúc dữ liệu phù hợp với mục đích sử dụng.
        System.out.println("Những Phương Thức Mà Iterator Cung Cấp Cho LinkedList");
        //Phương thức next(): Trả về phần tử tiếp theo của danh sách LinkedList.
        //Phương thức hasNext(): Kiểm tra xem có phần tử tiếp theo trong danh sách LinkedList hay không.
        //Phương thức remove(): Xóa phần tử hiện tại của danh sách LinkedList.
        //Phương thức forEachRemaining(): Thực hiện một hành động cho tất cả các phần tử trong danh sách LinkedList.
        //Phương thức forEach(): Thực hiện một hành động cho tất cả các phần tử trong danh sách LinkedList.
        //Phương thức spliterator(): Tạo một Spliterator cho danh sách LinkedList.
        System.out.println("Những phương thức mà listiterator cung cấp được mà iterator không có");
        //Phương thức next(): Trả về phần tử tiếp theo của danh sách LinkedList.
        //Phương thức hasNext(): Kiểm tra xem có phần tử tiếp theo trong danh sách LinkedList hay không.
        //Phương thức remove(): Xóa phần tử hiện tại của danh sách LinkedList.
        //Phương thức forEachRemaining(): Thực hiện một hành động cho tất cả các phần tử trong danh sách LinkedList.
        //Phương thức forEach(): Thực hiện một hành động cho tất cả các phần tử trong danh sách LinkedList.
        //Phương thức spliterator(): Tạo một Spliterator cho danh sách LinkedList.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // Sử dụng Iterator - hiển thị các phần tử
        Iterator<Integer> iterator = list.iterator();
        System.out.println("Các phần tử trong list là");
        while(iterator.hasNext()){// khi dùng for-each thì không cho phép truy cập
                                  // đến Iterator để thực hiện các thao tác xóa hoặc thay dổi các phần tử trong danh sách
            System.out.print(iterator.next());
        }
        System.out.println();
        //Thêm phan tu
        list.add(1 , 2);//Them phan tu vao vi tri chi dinh
        list.addFirst(0);//Them phan tu vao dau
        list.addLast(6);//Them phan tu vao cuoi
        iterator = list.iterator();
        while(iterator.hasNext()){// khi dùng for-each thì không cho phép truy cập
            // đến Iterator để thực hiện các thao tác xóa hoặc thay dổi các phần tử trong danh sách
            System.out.print(iterator.next());
        }
        System.out.println();
        //Xoa phan tu
        list.remove();//Xoa phan tu dau
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        iterator = list.iterator();
        while(iterator.hasNext()){// khi dùng for-each thì không cho phép truy cập
            // đến Iterator để thực hiện các thao tác xóa hoặc thay dổi các phần tử trong danh sách
            System.out.print(iterator.next());
        }
    }
}
