package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        DeliveryService InPostDeliveryService = new InPostDelivery();
        DeliveryService UPSDeliveryService = new UPSDelivery();

        ShippingCenter shippingCenterForInPost = new ShippingCenter(InPostDeliveryService, notificationService);
        shippingCenterForInPost.sendPackage("Hill Street 11, New York", 31); // false

        ShippingCenter shippingCenterForUPS = new ShippingCenter(UPSDeliveryService, notificationService);
        shippingCenterForUPS.sendPackage("Polna 23, Poznań", 33); //true
    }
}