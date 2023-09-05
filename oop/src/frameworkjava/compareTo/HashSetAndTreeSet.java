package frameworkjava.compareTo;

public class HashSetAndTreeSet {
    //Giống Nhau : Cả ba không cho phép các phần từ trùng lặp
               //: Cả ba không được đồng bộ(non-synchronized)
               //: Cả ba đều cài đặt interface C,lneable Và Sẻializable.
    //Khác Nhau : 1:HashSet sử dụng HashMap(mảng băm) nộ bộ để lưu trữ các phần tử
                //trong khi đó TreeSet sử dụng TreeMap(mảng cây) để lưu trữ
                //2:HashSet không duy trì bất kỳ thứ tự các phần tử được thêm vào
                //TreeSet duy trì thứ tự các phần tử theo bộ so sánh được cung cấp
                //các phần tử được sắp xếp theo thứ tự tăng dần
                //3:Hiệu suất của HashSet Sẽ Tốt Hơn TreeSet
                //4:
}
