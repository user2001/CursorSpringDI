package org.example.javaCodeConfig;

import org.springframework.beans.factory.annotation.Value;

public class Calculator {
    private MinusService minusService;
    private PlusService plusService;

    public Calculator(MinusService minusService, PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
    }

    @Value("${calculator.a}")
    private int a;
    @Value("${calculator.b}")
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void getResult() {
        if (a < b) {
            System.out.println("Result of math is " + plusService.doMath(getA(), getB()));
        } else
            System.out.println("Result of math is " + minusService.doMath(getA(), getB()));

    }
}

