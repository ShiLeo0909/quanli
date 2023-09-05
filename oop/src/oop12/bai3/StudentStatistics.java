package oop12.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentStatistics {
    private MyList students;

    /**
     * Khởi tạo dữ liệu cho StudentManager.
     */
    public StudentStatistics(MyList data) {
        /* TODO */
        this.students = data;
    }

    /**
     * Lấy ra danh sách các sinh viên được sắp xếp theo thứ tự phụ thuộc vào tên và họ.
     * Chú ý, không thay đổi thứ tự sinh viên trong danh sách gốc.
     *
     * @param order
     * @return danh sách các sinh viên đã được sắp xếp
     */
    public MyList sortByFullname(boolean order) {
        /*
         TODO

         - Sửa lại lớp Student để sử dụng MyComparable để thực hiện việc so sánh các Student theo tên và họ.
           Thứ tự đầu tiên phụ thuộc vào tên, nếu tên bằng nhau thì thứ tự phụ thuộc vào họ.

         - Sử dụng tiêu chí so sánh trong MyComparable, viết code để sắp xếp danh sách các sinh viên theo thứ tự
           phụ thuộc tham số order. Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì
           sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách sinh viên mới đã được sắp thứ tự.
         */
        List<Student> students1 = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            students1.add((Student) students.get(i));
        }
        //
        for (int i = 0; i < students1.size() - 1; i++) {
            for (int j = i + 1; j < students1.size(); j++) {
                if (students1.get(i).compareTo(students1.get(j)) < 0) {
                    Student tmp = students1.get(i);
                    students1.set(i, students1.get(j));
                    students1.set(j, tmp);

                }
            }
        }
        //
        if (!order) {
            Collections.reverse(students1);
        }
        MyList myList = new MyArrayList(); // tạo đối tượng mới của MyList
        for (int i = 0; i < students1.size(); i++) {
            myList.append(students1.get(i)); // thêm từng phần tử của students1 vào myList
        }
        return myList;
    }

    /**
     * Lấy ra danh sách các sinh viên được sắp xếp theo average.
     * Chú ý, không thay đổi thứ tự sinh viên trong danh sách gốc.
     *
     * @param order
     * @return
     */
//
    public MyList sortByAverage(boolean order) {
        /*
         TODO

         - Thêm lớp AverageComparison sử dụng StudentComparator để có thể so sánh các sinh viên theo average.

         - Viết code sử dụng AverageComparison để sắp xếp sinh viên theo thứ tự phụ thuộc tham số order.
           Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách các sinh viên mới đã được sắp xếp.
         */
        List<Student> students1 = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            students1.add((Student) students.get(i));
        }

        // Sắp xếp danh sách theo thứ tự tăng dần hoặc giảm dần của điểm trung bình
        for (int i = 1; i < students1.size(); i++) {
            Student key = students1.get(i);
            int j = i - 1;
            while (j >= 0 && students1.get(j).getAverage() > key.getAverage()) {
                students1.set(j+1, students1.get(j));
                j--;
            }
            students1.set(j+1, key);
        }
        if (!order) {
            Collections.reverse(students1);
        }
        MyList myList = new MyArrayList(); // tạo đối tượng mới của MyList
        for (int i = 0; i < students1.size(); i++) {
            myList.append(students1.get(i)); // thêm từng phần tử của students1 vào myList
        }
        return myList;
    }
}
