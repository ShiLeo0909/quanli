package behavioural.strategy;

import java.util.List;

public class QuickSort implements behavioural.strategy.SortStrategy {
    @Override
    public <String> void sort(List<String> items) {
        System.out.println("Quick sort");
    }
}
