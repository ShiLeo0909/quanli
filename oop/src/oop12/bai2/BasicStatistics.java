package oop12.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicStatistics {
    private MyVector[] vectors;

    public static void main(String[] args) {
        /*
         TODO

         Thực hiện các yêu cầu sau.

         I. Test chức năng vector
           - Viết các hàm testArrayVector để test các chứ năng của array vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...
           - Viết các hàm testListVector để test các chứ năng của list vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...

         II. Thực hiện thống kê đơn giản với các vector
           - Tạo ra ít nhất 10 vector và cho vào mảng vectors để quản lý. Trong đó có ít nhất 2 nhóm các vector
             có chuẩn bằng nhau.
           - Tìm và in ra thông tin chuẩn nhó nhất, chuẩn lớn nhất của các vector.
           - In ra các vector có chuẩn sắp xếp theo thứ tự tăng dần, giản dần.
           - In ra các vector có chuẩn nằm trong một đoạn [a, b] cho trước.
           - In ra rank của các vector theo thứ tự trong mảng vectors.

         III. Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
              (ví dụ NguyenVanA_123456_Vector.txt) và nộp cùng source code.
         */
        testArrayVector();
        testListVector();
        doSimpleStatic();
    }

    public static void testArrayVector() {
        /* TODO */
        // Khởi tạo một mảng vector để thực hiện các thao tác
        System.out.println("Test ArrayVector");
        MyArrayVector vectors = new MyArrayVector();
        System.out.println("Thêm vào tọa độ");
        vectors.insert(1);
        vectors.insert(2);
        vectors.insert(3);
        vectors.insert(4);
        System.out.println(vectors);

        System.out.println("Công thêm giá trị value");
        vectors.add(2);
        System.out.println(vectors);

        System.out.println("Cộng thêm vecto");
        vectors.add(vectors);
        System.out.println(vectors);

        System.out.println("Trừ tạo độ với giá trị value");
        vectors.minus(2);
        System.out.println(vectors);

        System.out.println("Trừ cho vecto khac");
        MyArrayVector vectors1 = new MyArrayVector();
        vectors1.insert(1);
        vectors1.insert(2);
        vectors1.insert(3);
        vectors1.insert(4);
        vectors.minus(vectors1);
        System.out.println(vectors);

        System.out.println("Tính Vô Hương");
        System.out.println(vectors.dot(vectors1));


        System.out.println("Mũ các phần tử trong vecto");
        System.out.println(vectors.pow(2));

        System.out.println("Các phần tử nhân với giá trị value");
        System.out.println(vectors.scale(0.5));

        System.out.println("Chuẩn của vecto");
        System.out.println(vectors.norm());

        System.out.println("Thêm một gái trị vào ví trí index");
        vectors.insert(2, 0);
        System.out.println(vectors);

        System.out.println("Xoa Phan tu o vi tri index");
        vectors.remove(1);
        System.out.println(vectors);

        System.out.println("Trích xuất ra vector con");
        int[] array = new int[]{2, 1};
        System.out.println(vectors.extract(array));
        System.out.println(vectors.coordinates());

    }

    public static void testListVector() {
        /* TODO */
        System.out.println("-------------------------------------------------------------");
        System.out.println("Test ListVecTor");
        System.out.println("Thêm vào tọa độ");
        MyListVector vectors = new MyListVector();
        vectors.insert(1);
        vectors.insert(1);
        vectors.insert(1);
        vectors.insert(1);
        vectors.insert(1);

        System.out.println(vectors);

        System.out.println("Cộng thêm giá trị value vào từng vị trí");
        vectors.add(1);
        System.out.println(vectors);

        System.out.println("Cộng thêm vecto ");
        MyListVector vectors1 = new MyListVector();
        vectors1.insert(1);
        vectors1.insert(1);
        vectors1.insert(1);
        vectors1.insert(1);
        vectors1.insert(1);
        vectors.add(vectors1);
        System.out.println(vectors);

        System.out.println("Trừ đi giá trị value");
        vectors.minus(1);
        System.out.println(vectors);

        System.out.println("Trừ đi một vecto khác");
        vectors.minus(vectors1);
        System.out.println(vectors);

        System.out.println("Nhân vơi giá trị vulue");
        vectors.scale(2);
        System.out.println(vectors);

        System.out.println("Chuẩn của vecto");
        System.out.println(vectors.norm());

        System.out.println("Thêm phần tư vào ví trí index");
        vectors.insert(3, 3);
        System.out.println(vectors);

        System.out.println("Xoa phan tu ở ví trí index");
        vectors.remove(3);
        System.out.println(vectors);

        System.out.println("Trích xuất vecto con");
        int[] array = new int[]{2, 1};
        System.out.println(vectors.extract(array));

    }

    public static void doSimpleStatic() {
        /* TODO */


        BasicStatistics basicStatistics = new BasicStatistics();
        basicStatistics.vectors = new MyVector[10];
        basicStatistics.vectors[0] = new MyArrayVector().insert(5);
        basicStatistics.vectors[1] = new MyArrayVector().insert(3);
        basicStatistics.vectors[2] = new MyArrayVector().insert(1);
        basicStatistics.vectors[3] = new MyArrayVector().insert(11);
        basicStatistics.vectors[4] = new MyArrayVector().insert(9);
        basicStatistics.vectors[5] = new MyArrayVector().insert(2);
        basicStatistics.vectors[6] = new MyArrayVector().insert(4);
        basicStatistics.vectors[7] = new MyArrayVector().insert(8);
        basicStatistics.vectors[8] = new MyArrayVector().insert(7);
        basicStatistics.vectors[9] = new MyArrayVector().insert(6);


        System.out.println(basicStatistics.normMax());
        System.out.println(basicStatistics.normMin());
        System.out.println(Arrays.toString(basicStatistics.rank()));
        System.out.println(Arrays.toString(basicStatistics.sortNorm(false)));
        System.out.println(Arrays.toString(basicStatistics.filter(1, 10)));


    }

    /**
     * Lấy giá trị chuẩn lớn nhất trong các vector.
     *
     * @return chuẩn lớn nhất.
     */
    public double normMax() {
        /* TODO */
        System.out.println("Chuẩn lớn trong các vector");
        double max = vectors[0].norm();
        for (int i = 1; i < vectors.length; i++) {
            if (vectors[i].norm() > max) {
                max = vectors[i].norm();
            }
        }
        return max;
    }

    /**
     * Lấy giá trị chuẩn nhỏ nhất trong các vector.
     *
     * @return chuẩn nhỏ nhất.
     */
    public double normMin() {
        /* TODO */
        System.out.println("Chuẩn bé nhất trong các vector");
        double min = vectors[0].norm();
        for (int i = 1; i < vectors.length; i++) {
            if (vectors[i].norm() < min) {
                min = vectors[i].norm();
            }
        }
        return min;
    }

    /**
     * Lấy ra mảng các vector được sắp xếp theo thứ tự của chuẩn.
     * Nếu order là true thì mảng đầu ra là các vector có chuẩn tăng dần.
     * Nếu order là false thì mảng đầu ra là các vector có chuẩn giảm dần.
     *
     * @return mảng các vector theo thứ tự mảng tăng dần.
     */
    public MyVector[] sortNorm(boolean order) {
        /* TODO */
        System.out.println("Sắp xếp theo chuẩn của các vector");
        if (order) {
            for (int i = 0; i < vectors.length - 1; i++) {
                for (int j = i + 1; j < vectors.length; j++) {
                    if (vectors[i].norm() < vectors[j].norm()) {
                        MyVector temp = vectors[i];
                        vectors[i] = vectors[j];
                        vectors[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < vectors.length - 1; i++) {
                for (int j = i + 1; j < vectors.length; j++) {
                    if (vectors[i].norm() > vectors[j].norm()) {
                        MyVector temp = vectors[i];
                        vectors[i] = vectors[j];
                        vectors[j] = temp;
                    }
                }
            }
        }

        return vectors;

    }

    /**
     * Lọc ra mảng các vector có chuẩn năm trong đoạn [from, to].
     *
     * @param from
     * @param to
     * @return các vector có chuẩn nằm trong đoạn [from, to]
     */
    public MyVector[] filter(int from, int to) {
        /* TODO */
        System.out.println("Chuẩn của vector chạy trong khoảng quy định");
        MyVector[] myVector = new MyVector[vectors.length];
        int index = 0;
        for (int i = 0; i < vectors.length; i++) {
            if (vectors[i].norm() >= from && vectors[i].norm() <= to) {
                myVector[index] = vectors[i];
                index++;
            }
        }
        return Arrays.copyOf(myVector, index);
    }

    /**
     * Lấy ra thông tin rank của các vector trong mảng theo chuẩn.
     * Rank được tính theo quy luật sau, ví dụ
     * - tập [3 1 4] có rank [2.0 1.0 3.0]
     * - tập [3 1 3 5] có các rank [2.5 1.0 4.0] (các phần tử có giá trị bằng nhau có rank
     * được tính bằng trung bình các chỉ số của các phần tử trong tập dữ liệu, chỉ sổ bắt
     * đầu là 1)
     *
     * @return
     */
    public double[] rank() {
        /* TODO */
        System.out.println("Rank của theo chuẩn vector");
        double[] ranks = new double[vectors.length];
        double[] sortedNorms = new double[vectors.length];

        // Tính chuẩn của các vector và lưu vào mảng sortedNorms
        for (int i = 0; i < vectors.length; i++) {
            sortedNorms[i] = vectors[i].norm();
        }

        // Tạo một danh sách để lưu trữ rank của từng giá trị chuẩn
        List<Double> rankList = new ArrayList<>();

        // Sắp xếp mảng sortedNorms theo thứ tự tăng dần
        Arrays.sort(sortedNorms);

        // Tính rank cho từng giá trị chuẩn
        for (int i = 0; i < sortedNorms.length; i++) {
            int count = 1;
            double rank = i + 1;
            if (i > 0 && sortedNorms[i] == sortedNorms[i - 1]) {
                count++;
                rank += rankList.get(rankList.size() - 1) * (count - 1);
            }
            rank /= count;
            rankList.add(rank);
        }

        // Lưu trữ rank vào mảng ranks theo thứ tự tương ứng với mảng vectors
        for (int i = 0; i < vectors.length; i++) {
            double norm = vectors[i].norm();
            int index = Arrays.binarySearch(sortedNorms, norm);
            double rank = rankList.get(index);
            ranks[i] = rank;
        }

        return ranks;
    }
}

