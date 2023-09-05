package bai2deA3;

import java.util.List;

public class ListDatasSet extends AbstractDataSet {
    private List<Double> data;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public ListDatasSet() {
        /* TODO */
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double element(int index) {
        /* TODO */
        return data.get(index);
    }

    @Override
    public double[] elements(int from, int to) {
        /* TODO */
        if (from < 0 || to >= data.size() || from > to) {
            throw new IllegalArgumentException("Invalid range"); // Kiểm tra tính hợp lệ của khoảng từ from đến to
        }

        double[] elements = new double[to - from + 1]; // Tạo mảng mới với kích thước là (to - from + 1)
        for (int i = from; i <= to; i++) {

            elements[i - from] = data.get(i); // Gán giá trị của phần tử trong danh sách data vào mảng mới
        }

        return elements;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (index < 0 || index > data.size()) {
            throw new IllegalArgumentException("Invalid index"); // Kiểm tra tính hợp lệ của index
        }

        data.add(index, value);
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >= data.size()) {
            throw new IllegalArgumentException("Invalid index"); // Kiểm tra tính hợp lệ của index
        }

        data.remove(index);
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        data.removeIf(element -> element == value);
    }
}
