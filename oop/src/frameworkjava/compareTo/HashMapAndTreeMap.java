package frameworkjava.compareTo;

public class HashMapAndTreeMap {
    //Khac Nhau : 1: HashMap sử dụng mảng băm cấu trúc dữ liệu
                // TreeMap sử dụng cây đỏ đen làm cấu trúc dữ liệu.
                //2: TreeMap bảo toàn thứ tự HashMap thì không
                //3: 	HashMap mở rộng lớp AbstractMap và triển khai giao diện Bản đồ.
                //     TreeMap mở rộng lớp AbstractMap và triển khai giao diện SortedMap và NavigableMap.

    //Định Nghĩa của HashMap : Bản đồ băm là một lớp Bản đồ. Nó sử dụng bảng băm, như một cấu trúc dữ liệu
    // để lưu trữ cặp giá trị khóa của bản đồ. Việc chèn cặp khóa-giá trị được thực hiện bằng cách sử dụng
    // Mã Băm sau đó chìa khóa. Do đó, mỗi khóa trong bản đồ phải là duy nhất vì nó sẽ được sử dụng để truy xuất các giá trị.
    //
    //Thứ tự chèn trong HashMap là không phải được bảo toàn có nghĩa là đối tượng hashmap không trả về
    // các phần tử theo thứ tự chúng đã được chèn vào. Mặt khác, thứ tự mà các phần tử sẽ được trả về không cố định.
    //
    //Các Chìa khóa được phép VÔ GIÁ TRỊ cùng một lúc, nhưng giá trị có thể VÔ GIÁ TRỊ bất kỳ lúc nào.
    // HashMap có thể chứa không đồng nhất đối tượng cho các khóa cũng như các giá trị
}
