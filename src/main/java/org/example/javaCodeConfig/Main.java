package org.example.javaCodeConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                MathConfig.class);
        Calculator calculator = context.getBean("calculator",Calculator.class);
        calculator.getResult();
    }
}
