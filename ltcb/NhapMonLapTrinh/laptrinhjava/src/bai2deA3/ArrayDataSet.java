package bai2deA3;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        data = new double[DEFAULT_CAPACITY];
        size = 0;;
    }


    @Override
    public int size() {
        /* TODO */
        return size;
    }

    @Override
    public double element(int index) {
        /* TODO */
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
        }
        return data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        /* TODO */
        double [] datanew = new double[data.length];
        for (int i = from; i < to; i++) {
            datanew[i] = data[i];
        }
        return datanew;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        if(size == data.length){
            enlarge();
        }
        data[size] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        checkBoundaries(index ,size);
        enlarge();
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = value; // Thêm giá trị mới vào vị trí index
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        checkBoundaries(index, size);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size -1] = 0;
        size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            if(data[i] == value){
                remove(i);
                i--;
            }
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void enlarge() {
        /* TODO */
        double [] newData = new double[data.length*2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
    void checkBoundaries(int index , int size){
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}

