package behavioural.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        behavioural.strategy.SortedList sortedList = new behavioural.strategy.SortedList();
        sortedList.add("Java Core");
        sortedList.add("Java Design Pattern");
        sortedList.add("Java Framework");

        sortedList.setSortStrategy(new behavioural.strategy.QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new behavioural.strategy.MergeSort());
        sortedList.sort();
    }
}
