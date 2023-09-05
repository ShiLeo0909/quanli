package oop10.strategy.pseudocode;

public class Context {
    private Strategy strategy;

    public Context() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int Calculate(int a , int b){
        return strategy.Calculate(a,b);
    }
}
