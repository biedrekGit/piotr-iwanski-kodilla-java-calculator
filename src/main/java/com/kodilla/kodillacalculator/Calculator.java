package com.kodilla.kodillacalculator;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a -b;
    }

    public static void main(String[] args)  {
        Calculator calculator = new Calculator();
        int a = 67;
        int b = 23;
        int addResult = calculator.addition(a, b);
        int subResult = calculator.subtraction(a, b);

        System.out.println(a + " plus " + b + " equals: " + addResult);
        System.out.println(a + " minus " + b + " equals: " + subResult);
    }
}
