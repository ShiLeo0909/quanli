package oop10.strategy.pseudocode;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dau");
        int a = sc.nextInt();
        System.out.println("Nhap so sau");
        int b = sc.nextInt();
        System.out.println("Nhap kieu tinh ");
        String action = sc.next();

        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if (action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        }
        if (action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.Calculate(a,b);
        System.out.println(result);
    }
}
