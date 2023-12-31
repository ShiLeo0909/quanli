package bai2deA3;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        /*
        TODO

        I. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         Viết hàm test cho ListDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */
        ArrayDataSet data = new ArrayDataSet();
        // Thêm phần tử
        System.out.println("Them Phan Tu Vao Mang");
        data.append(5.6);
        data.append(10);
        data.append(9);
        data.append(8);
        data.append(7);
        data.append(6);
        data.append(5.5);
        data.append(5.5);
        data.append(4.5);
        data.append(3.3);
        data.append(2.2);
        System.out.println("Tập dữ liệu: " + data.toString());
        // Thêm phần tử vào đầu tập dữ liệu
        System.out.println("Them Phan Tu Vao Vi Tri Dau Tien");
        data.insert(0.99, 0);
        // In ra các dữ liệu thống kê
        System.out.println("Tập dữ liệu: " + data.toString());
        //Xoa phan tu tai vi tri index
        System.out.println("Xoa Phan Tu Dau Tien va Phan Tu Co Gia tri = 5.5");
        data.remove(0);
        data.remove(5.5);
        System.out.println("Tập dữ liệu: " + data.toString());
        BasicStatistic myStatistic = new BasicStatistic();
        myStatistic.setDataSet(data);
        System.out.println("Cỡ mẫu: " + myStatistic.size());
        System.out.println("Max: " + myStatistic.max());
        System.out.println("Min: " + myStatistic.min());
        System.out.println("Kỳ vọng: " + myStatistic.mean());
        System.out.println("Phương sai: " + myStatistic.variance());
        System.out.println("Rank: " + Arrays.toString(myStatistic.rank()));
        System.out.println("Median: " + myStatistic.median());
    }
}

