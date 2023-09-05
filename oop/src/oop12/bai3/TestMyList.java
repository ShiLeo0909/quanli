package oop12.bai3;

import java.util.Iterator;

public class TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
        System.out.println("Test ArrayList");
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.append(new Student("Phung Huu " ,"A", 9 ));
        myArrayList.append(new Student("Phung Huu " ,"B", 8 ));
        myArrayList.append(new Student("Phung Huu " ,"C", 7 ));
        myArrayList.append(new Student("Phung Huu " ,"D", 6 ));
        myArrayList.append(new Student("Phung Huu " ,"E", 5 ));
        myArrayList.append(new Student("Phung Huu " ,"F", 4 ));
        myArrayList.append(new Student("Phung Huu " ,"G", 3.5 ));
        myArrayList.append(new Student("Phung Huu " ,"H", 3 ));
        myArrayList.append(new Student("Phung Huu " ,"I", 2 ));
        myArrayList.append(new Student("Phung Huu " ,"K", 1 ));
        System.out.println(myArrayList);
        System.out.println("Them vao vi tri index");
        myArrayList.insert(new Student("Phung Huu " , "U", 8.2), 2);
        System.out.println(myArrayList);
        System.out.println("Sua phan tu o ví tri index");
        myArrayList.set(new Student("Phung Huu " , "X" , 8.8) , 1);
        System.out.println(myArrayList);
        System.out.println("Xoa phan tu o vi tri index");
        myArrayList.remove(0);
        System.out.println(myArrayList);
        //
        System.out.println("Sắp xếp theo điểm tb");
        StudentStatistics statistics = new StudentStatistics(myArrayList);
        MyList soList = statistics.sortByAverage(true);
        System.out.println(soList);
        System.out.println("Sắp Xếp Theo Tên và Họ");
        MyList soList1 = statistics.sortByFullname(false);
        System.out.println(soList1);


    }

    public static void testMyLinkedList() {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
        System.out.println("------------------------------------------------------------");
        System.out.println("Test LinkedList");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(new Student("Phung Huu " ,"A", 9 ));
        myLinkedList.append(new Student("Phung Huu " ,"B", 8 ));
        myLinkedList.append(new Student("Phung Huu " ,"C", 7 ));
        myLinkedList.append(new Student("Phung Huu " ,"D", 6 ));
        myLinkedList.append(new Student("Phung Huu " ,"E", 5 ));
        myLinkedList.append(new Student("Phung Huu " ,"F", 4 ));
        myLinkedList.append(new Student("Phung Huu " ,"G", 3.5 ));
        myLinkedList.append(new Student("Phung Huu " ,"H", 3 ));
        myLinkedList.append(new Student("Phung Huu " ,"I", 2 ));
        myLinkedList.append(new Student("Phung Huu " ,"K", 1 ));
        System.out.println(myLinkedList);
        System.out.println("Them vao vi tri index");
        myLinkedList.insert(new Student("Phung Huu " , "U", 8.2), 2);
        System.out.println(myLinkedList);
        System.out.println("Sua phan tu o ví tri index");
        myLinkedList.set(new Student("Phung Huu " , "X" , 8.8) , 1);
        System.out.println(myLinkedList);
        System.out.println("Xoa phan tu o vi tri index");
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        //
        System.out.println("Sắp xếp theo điểm tb");
        StudentStatistics statistics = new StudentStatistics(myLinkedList);
        MyList soList = statistics.sortByAverage(true);
        System.out.println(soList);
        System.out.println("Sắp Xếp Theo Tên và Họ");
        MyList soList1 = statistics.sortByFullname(false);
        System.out.println(soList1);
    }

    public static void testIterator(MyList myList) {
        /*
         TODO
         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
    }
}
