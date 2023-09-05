package oop10.strategy.sort;

import oop10.strategy.pseudocode.Strategy;

public class BubbleSort implements Strategys {
    private Strategy strategy;

    public BubbleSort(Strategy strategy) {
        this.strategy = strategy;
    }

    public BubbleSort() {
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
