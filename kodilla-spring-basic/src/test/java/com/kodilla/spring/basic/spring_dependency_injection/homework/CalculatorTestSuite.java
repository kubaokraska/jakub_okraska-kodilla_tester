package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldDisplayCorrectValueWithCalculatorRandomMethod() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display displayBean = context.getBean(Display.class);
        Calculator calculatorBean = context.getBean(Calculator.class);

        double resultToDisplay = calculatorBean.add(2, 3);
        String message = displayBean.display(resultToDisplay);

        Assertions.assertEquals("Result: 5", message);
    }

    @Test
    public void addMethodTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        double result = bean.add(3, 2.51);

        Assertions.assertEquals(5.51, result, 0.01);
    }

    @Test
    public void subtractMethodTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        double result = bean.subtract(3, 2.49);

        Assertions.assertEquals(0.51, result, 0.01);
    }

    @Test
    public void multiplyMethodTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        double result = bean.multiply(2, 5.39);

        Assertions.assertEquals(10.78, result, 0.01);
    }

    @Test
    public void divideMethodTest() throws DivideByZero {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        double result = bean.divide(5.42, 2);

        Assertions.assertEquals(2.71, result, 0.01);
    }

    @Test
    public void shouldThrowExceptionWhenDivideByZero() throws DivideByZero {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        Assertions.assertThrows(DivideByZero.class, () -> bean.divide(5.42, 0));
    }
}