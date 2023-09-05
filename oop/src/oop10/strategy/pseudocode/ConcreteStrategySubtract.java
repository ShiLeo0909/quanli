package oop10.strategy.pseudocode;

import java.sql.Statement;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public int Calculate(int a, int b) {
        return a -b;
    }
}
