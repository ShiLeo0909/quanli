package oop10.strategy.sort;

public class Context {
    private Strategys strategy;

    public Context() {
    }
    public void setStrategy(Strategys strategy) {
        this.strategy = strategy;
    }
    public Context(Strategys strategy) {
        this.strategy = strategy;
    }
    public void sort(int [] array){
        strategy.sort(array);
    }
}
