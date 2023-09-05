package oop12.bai2;

import java.util.Arrays;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 1;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        /* TODO */
        data = new double[DEFAULT_CAPACITY];
        size = 0;
    }


    @Override
    public int size() {
        /* TODO */
        return size;
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        return data;
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data[index] = value;
    }

    /**
     * Cộng các giá trị tọa độ với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector add(double value) {
        /* TODO */
        for (int i = 0; i < size; i++) {
            data[i] += value;
        }
        return this;
    }

    /**
     * Cộng vector khác vào vector hiện tại.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector add(MyArrayVector another) {
        /* TODO */
        if (size != another.size()) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        for (int i = 0; i < size; i++) {
            data[i] += another.data[i];
        }
        return this;
    }

    /**
     * Trừ các giá trị tọa độ của vector cho value.
     * @return vector hiện tại.
     */
    public MyArrayVector minus(double value) {
        /* TODO */
        for (int i = 0; i < size; i++) {
            data[i] -= value;
        }
        return this;
    }


    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyArrayVector minus(MyArrayVector another) {
        /* TODO */
        if (size != another.size()) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        for (int i = 0; i < size; i++) {
            data[i] -= another.data[i];
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public double dot(MyArrayVector other) {
        /* TODO */
        if (data.length != other.data.length) {
            throw new IllegalArgumentException("Two vectors do not have the same dimension");
        }

        double dotProduct = 0;
        for (int i = 0; i < data.length; i++) {
            dotProduct += data[i] * other.data[i];
        }

        return dotProduct;
    }

    /**
     * Các giá trị của vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        /* TODO */
        for (int i = 0; i < size; i++) {
            data[i] = Math.pow(data[i], power);
        }
        return this;
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        /* TODO */
        for (int i = 0; i < size; i++) {
            data[i] *= value;
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        /* TODO */
        double result = 0.0;
        for (int i = 0; i < size; i++) {
            result += data[i] * data[i];
        }
        return Math.sqrt(result);
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        /* TODO */
        if (size == data.length) {
            enlarge();
        }
        data[size++] = value;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        /* TODO */
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (size == data.length) {
            enlarge();
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        /* TODO */
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
            return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        /* TODO */
        MyArrayVector myArrayVector = new MyArrayVector();

        for (int index : indices) {
            if (index < 0 || index >= size()) {
                throw new IllegalArgumentException("Chỉ số không hợp lệ.");
            }
            myArrayVector.insert(coordinate(index));
        }

        return myArrayVector;
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        /* TODO */
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
            return this;
    }
}
