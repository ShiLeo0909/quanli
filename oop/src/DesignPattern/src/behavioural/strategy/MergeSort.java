package behavioural.strategy;

import java.util.List;

public class MergeSort implements behavioural.strategy.SortStrategy {
    @Override
    public <String> void sort(List<String> items) {
        System.out.println("Merge Sort");
    }
}
