package com.kodilla.spring.basic.dependency_injection.homework;

public class UPSDelivery implements DeliveryService {
    public boolean deliverPackage(String address, double weight) {
        if (weight > 35) {
            System.out.println("Package too heavy");
            return false;
        }

        System.out.println("Delivering in progress...");
        return true;
    }
}