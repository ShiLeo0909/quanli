package oop10.strategy.sort;

public class TestMain {
    public static void main(String[] args) {
        Context context = new Context();
        int [] array1 = new int[] {9,4,3,2,1};
        context.setStrategy(new BubbleSort());
        context.sort(array1);

        int [] array2 = new int[] {9,4,3,2,1};
        context.setStrategy(new SelectionSort());
        context.sort(array2);

        int [] array3 = new int[] {9,4,3,2,1};
        context.setStrategy(new InserSort());
        context.sort(array3);
    }
}
