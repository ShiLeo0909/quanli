package bai2;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.

        int[] arr = new int[]{5, 4, 3, 2, 1};
        int[] arr1 = new int[]{5, 4, 3, 2, 1};
        int[] arr2 = new int[]{5, 4, 3, 2, 1};
//        int [] arr = new int[20];
//        Random ramdom = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = ramdom.nextInt(100);
//        }
        // In ra mảng đã tạo
        //printArray(arr);
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Bubble Sort Algorithm");
        System.out.println("Before sorting");
        printArray(arr);
        System.out.println("After sorting");
        SortStrategy.getInstance().setSortee(new BubbleSort());
        int swapBubbleSort = SortStrategy.getInstance().sort(arr);
        System.out.println("Number of swap " + swapBubbleSort);
        printArray(arr);
        System.out.println("================================");
        System.out.println("Slection Sort Algorithm");
        System.out.println("Before sorting");
        printArray(arr1);
        System.out.println("After sorting");
        SortStrategy.getInstance().setSortee(new SelectionSort());
        int swapSelectionSort = SortStrategy.getInstance().sort(arr1);
        System.out.println("Number of swap " + swapSelectionSort);
        printArray(arr1);
        System.out.println("================================");
        System.out.println("Inser Sort Algorithm");
        System.out.println("Before sorting");
        printArray(arr2);
        System.out.println("After sorting");
        SortStrategy.getInstance().setSortee(new InsertionSort());
        int swapInserSort = SortStrategy.getInstance().sort(arr2);
        System.out.println("Number of swap " + swapInserSort);
        printArray(arr2);
    }
    public static void printArray(int[]arr){
        System.out.println(Arrays.toString(arr));
    }
}
