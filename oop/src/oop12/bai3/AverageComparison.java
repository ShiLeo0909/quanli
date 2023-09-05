package oop12.bai3;

public class AverageComparison implements StudentComparator{
    public int compare(Student student1, Student student2) {
        // Lấy trung bình điểm của hai sinh viên
        double average1 = student1.getAverage();
        double average2 = student2.getAverage();

        // So sánh trung bình điểm của hai sinh viên và trả về kết quả dựa trên tham số order
        if (average1 < average2) {
            return   1; // Sắp xếp tăng dần nếu order là true, ngược lại sắp xếp giảm dần
        } else if (average1 > average2) {
            return  -1; // Sắp xếp tăng dần nếu order là true, ngược lại sắp xếp giảm dần
        } else {
            return 0; // Trung bình điểm bằng nhau
        }
    }
}
