package com.kodilla;

public class Calculator {
    public int sumAB(int a, int b) {
        return a + b;
    }

    public int subtractionAB(int a, int b) {
        return a - b;
    }
}
class Application
{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.sumAB(4, 2);
        calculator.subtractionAB(5,8);

    }
}




















