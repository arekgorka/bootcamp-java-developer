package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double resultAdd = display.displayValue(a + b);
        return resultAdd;
    }

    public double sub(double a, double b) {
        double resultSub = display.displayValue(a - b);
        return resultSub;
    }

    public double mul(double a, double b) {
        double resultMul = display.displayValue(a * b);
        return resultMul;
    }

    public double div(double a, double b) {
        double resultDiv = display.displayValue(a / b);
        return resultDiv;
    }
}
