package org.example.methods;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new ScientificCalculator(10, 0);
        System.out.println(calculator.div());

        System.out.println("done");
    }
}
