package org.example.annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Calculator {
    private MinusService minusService;
    private PlusService plusService;

    @Autowired
    public void setMinusService(MinusService minusService) {
        this.minusService = minusService;
    }

    @Autowired
    public void setPlusService(PlusService plusService) {
        this.plusService = plusService;
    }

    @Value("${calculator.a}")
    private int a;
    @Value("${calculator.b}")
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void getResult() {

        if (a < b) {
            System.out.println("Result of math is " + plusService.doMath(getA(), getB()));
        } else
            System.out.println("Result of math is " + minusService.doMath(getA(), getB()));

    }
}