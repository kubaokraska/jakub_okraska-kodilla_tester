package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book potopSienkiewicz = BookManager.createBook("Potop", "Henryk Sienkiewicz");
        Book potopSienkiewicz1 = BookManager.createBook("Potop", "Henryk Sienkiewicz");
        Book potopSienkiewicz2 = BookManager.createBook("Potop", "Henryk Sienkiewicz");

        Book dziadyMickiewicz = BookManager.createBook("Dziady", "Adam Mickiewicz");
        Book quoVadisSienkiewicz = BookManager.createBook("Quo Vadis", "Henryk Sienkiewicz");

        System.out.println("Size of the book collection: " + BookManager.getCollectionSize());
        System.out.println(potopSienkiewicz == potopSienkiewicz1);
        System.out.println(potopSienkiewicz2 == potopSienkiewicz1);
        System.out.println(dziadyMickiewicz == quoVadisSienkiewicz);

        System.out.println(potopSienkiewicz);
        System.out.println(potopSienkiewicz1);
        System.out.println(potopSienkiewicz2);
        System.out.println(dziadyMickiewicz);
        System.out.println(quoVadisSienkiewicz);
    }
}