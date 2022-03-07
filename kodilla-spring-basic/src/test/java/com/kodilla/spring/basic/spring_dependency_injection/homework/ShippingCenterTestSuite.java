package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrueIfWeightIsGood() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);

        assertTrue(bean.deliverPackage("Address", 29));
    }

    @Test
    public void shouldReturnFalseIfOverweight() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);

        assertFalse(bean.deliverPackage("Address", 31));
    }

    @Test
    public void shouldReturnSuccessNotification() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);

        String message = "Package delivered to: Polna";

        assertEquals(message, bean.sendPackage("Polna", 29));
    }

    @Test
    public void shouldReturnFailNotification() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);

        String message = "Package not delivered to: Polna";

        assertEquals(message, bean.sendPackage("Polna", 31));
    }
}