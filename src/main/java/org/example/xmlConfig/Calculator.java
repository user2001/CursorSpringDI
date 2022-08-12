package org.example.xmlConfig;

public class Calculator {
    private MinusService minusService;
    private PlusService plusService;

    public void setMinusService(MinusService minusService) {
        this.minusService = minusService;
    }

    public void setPlusService(PlusService plusService) {
        this.plusService = plusService;
    }

    private int a, b;

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

    public void gerResult() {
        if (a < b) {
            System.out.println("Result of math is " + plusService.doMath(getA(), getB()));
        } else
            System.out.println("Result of math is " + minusService.doMath(getA(), getB()));

    }
}

