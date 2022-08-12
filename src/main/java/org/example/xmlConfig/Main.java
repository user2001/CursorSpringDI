package org.example.xmlConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Calculator calculator=context.getBean("calculator",Calculator.class);
        calculator.gerResult();
        context.close();
    }
}
