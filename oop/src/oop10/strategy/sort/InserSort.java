package oop10.strategy.sort;

public class InserSort implements Strategys {
    private Strategys strategy;

    public InserSort() {
    }

    public InserSort(Strategys strategy) {
        this.strategy = strategy;
    }

    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
