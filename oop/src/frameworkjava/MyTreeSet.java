package frameworkjava;


import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        System.out.println("TreeSet là tập không đồng bộ");
        //Treeset không được đồng bộ hóa

        //TreeSet không chứa các phần tử trùng lặp.
        //Các phần tử trong một TreeSet được sắp xếp theo
        // thứ tự tự nhiên của chúng, hoặc dựa trên một bộ
        // so sánh Comparator tùy chỉnh được cung cấp tại
        // thời điểm khởi tạo TreeSet.
        //
        // TreeSet không thể chứa các giá trị null.
        //
        // TreeSet sử dụng TreeMap để lưu trữ các phần tử.
        //
        // TreeSet class không phải là một thread-safe.
        // Bạn phải đồng bộ hóa rõ ràng quyền truy cập
        // đồng thời vào TreeSet trong môi trường đa luồng.
        //add(element): Thêm một phần tử vào tập hợp.
        //
        //remove(element): Xóa một phần tử khỏi tập hợp.
        //
        //contains(element): Kiểm tra xem tập hợp có chứa phần tử được chỉ định hay không.
        //
        //size(): Trả về số lượng phần tử trong tập hợp.
        //
        //isEmpty(): Kiểm tra xem tập hợp có rỗng hay không.
        //
        //clear(): Xóa tất cả các phần tử khỏi tập hợp.
        //
        //iterator(): Trả về một iterator để lặp qua tất cả các phần tử trong tập hợp theo thứ tự tăng dần.
        //
        //first(): Trả về phần tử đầu tiên trong tập hợp.
        //
        //last(): Trả về phần tử cuối cùng trong tập hợp.
        //
        //headSet(element): Trả về tập hợp con chứa tất cả các phần tử nhỏ hơn phần tử được chỉ định.
        //
        //tailSet(element): Trả về tập hợp con chứa tất cả các phần tử lớn hơn hoặc bằng phần tử được chỉ định.
        //
        //subSet(fromElement, toElement): Trả về tập hợp con chứa tất cả các phần tử từ phần tử đầu tiên lớn hơn hoặc bằng fromElement và nhỏ hơn toElement.
        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("Java");
        treeset.add("Ke thua");
        treeset.add("Dong goi");
        treeset.add("Truu tuong");
        treeset.add("Da hinh");
        System.out.println(treeset);
        for (String i: treeset) {
            System.out.println(i);
        }
        //
        System.out.println("Tra ve phan tu dua tien va phan tu cuoi cung");
        System.out.println(treeset.first());
        System.out.println(treeset.last());
        //
        System.out.println("Kiem tra xem co phan tu Java trong mang khong");
        System.out.println(treeset.contains("Java"));
        //
        System.out.println("So luong phan tu trong set");
        System.out.println(treeset.size());
        //
        System.out.println("Kiem tra xem tap co Rong hay không");
        System.out.println(treeset.isEmpty());
        //
        System.out.println("Tra ve tap cao co cac phan tu nho hơn phan tu duoc chi dinh");
        System.out.println(treeset.headSet("Java"));
        //
        System.out.println("Tra ve tap con gom cac phna tu lon hơn phan tu chi dinh");
        System.out.println(treeset.tailSet("Java"));
        //
        System.out.println("Trả về tập hợp con chứa tất cả các phần tử từ phần tử đầu tiên lớn hơn hoặc bằng fromElement và nhỏ hơn toElement.");
        System.out.println(treeset.subSet("Dong goi" , "Ke thua"));
        //
        //Tuy nhiên, TreeSet cũng có một số hạn chế như:
        //
        //Chỉ chứa các phần tử có thể được so sánh:

        // TreeSet yêu cầu các phần tử của nó phải có thể được so sánh với nhau.
        // Do đó, các đối tượng không thể so sánh được, ví dụ như các đối tượng
        // có thuộc tính kiểu dữ liệu nguyên thủy và các đối tượng của lớp không
        // cùng loại, không thể được chứa trong TreeSet.
        //
        //Tốn kém trong việc thêm, xóa phần tử: Mặc dù tìm kiếm và truy xuất phần
        // tử trong TreeSet nhanh, nhưng việc thêm hoặc xóa phần tử lại tốn kém hơn
        // so với các Collection khác, do phải cập nhật lại cây đỏ-đen.
    }
}
