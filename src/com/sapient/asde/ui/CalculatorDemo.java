package com.sapient.asde.ui;

import com.sapient.asde.service.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("10.0 + 27.67 is : " + calculator.add(10.0, 27.67));
        System.out.println("27.67 - 10.0 is : " + calculator.add(27.67,10.0));
    }
}
