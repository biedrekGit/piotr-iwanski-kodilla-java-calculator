package com.kodilla.kodillacalculator;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a -b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args)  {
        Calculator calculator = new Calculator();
        double a = 67;
        double b = 23;
        double addResult = calculator.addition(a, b);
        double subResult = calculator.subtraction(a, b);
        double mulResult = calculator.multiplication(a, b);
        double divResult = calculator.division(a, b);

        System.out.println(a + " plus " + b + " equals: " + addResult);
        System.out.println(a + " minus " + b + " equals: " + subResult);
        System.out.println(a + " times " + b + " equals: " + mulResult);
        System.out.println(a + " divided by " + b + " equals: " + divResult);
    }
}
