package oop10.strategy.pseudocode;

public class ConcreteStrategyMultiply implements    Strategy{
    @Override
    public int Calculate(int a, int b) {
        return a * b;
    }
}
