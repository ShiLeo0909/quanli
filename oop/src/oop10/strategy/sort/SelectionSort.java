package oop10.strategy.sort;

public class SelectionSort implements Strategys {
    private Strategys strategy;

    public SelectionSort() {
    }

    public SelectionSort(Strategys strategy) {
        this.strategy = strategy;
    }

    @Override
    public void sort(int[] array) {
        int n = array.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
