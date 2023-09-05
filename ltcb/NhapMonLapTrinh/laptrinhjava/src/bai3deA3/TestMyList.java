package bai3deA3;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         * Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
         * (ví dụ, NguyenVanA_123456_MyList.txt)
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("Test ArrayList");
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.append(9.9);
        myArrayList.append(8.8);
        myArrayList.append(6.6);
        System.out.println(myArrayList);
        myArrayList.insert(7.7, 2);
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);

        BasicStatistic statistic = new BasicStatistic(myArrayList);
        System.out.println("Max" + statistic.max());
        System.out.println("Min" + statistic.min());
        System.out.println("Mean" + statistic.mean());
        System.out.println("Variance " + statistic.variance());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("Test LinkedList");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(9.9);
        myLinkedList.append(8.8);
        myLinkedList.append(6.6);
        System.out.println(myLinkedList);
        myLinkedList.insert(7.7, 2);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);

        BasicStatistic statistic = new BasicStatistic(myLinkedList);
        System.out.println("Max" + statistic.max());
        System.out.println("Min" + statistic.min());
        System.out.println("Mean" + statistic.mean());
        System.out.println("Variance " + statistic.variance());
    }
}

