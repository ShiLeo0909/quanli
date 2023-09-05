package oop10.strategy.pseudocode;

public class ConcreteStrategyAdd implements Strategy{
    @Override
    public int Calculate(int a, int b) {
        return a + b;
    }
}
