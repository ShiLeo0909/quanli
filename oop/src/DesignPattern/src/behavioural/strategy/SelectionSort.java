package behavioural.strategy;

import java.util.List;

public class SelectionSort implements behavioural.strategy.SortStrategy {
    @Override
    public <String> void sort(List<String> items) {
        System.out.println("Selection Sort");
    }
}
