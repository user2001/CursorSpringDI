package org.example.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(
                "applicationContextAnnotation.xml");
        Calculator calculator=applicationContext.getBean("calculator",Calculator.class);
        calculator.getResult();

    }
}
