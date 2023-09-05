package bai2;

public class SelectionSort implements ISort {
    @Override
//    public int sort(int[] data) {
//        /* TODO */
//        int count = 0;
//        for (int i = 0; i < data.length - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < data.length; j++) {
//                if (data[j] < data[min]) {
//                    min = j;
//                }
//            }
//            if (min != i) {
//                int temp = data[i];
//                data[i] = data[min];
//                data[min] = temp;
//                count++;
//            }
//        }
//        return count;
//    }
    public int sort(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = data[i];
                data[i] = data[min];
                data[min] = temp;
                count++;
            }
        }
        return count;
    }
}
