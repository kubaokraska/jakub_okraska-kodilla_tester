package com.kodilla.abstracts;

public class Applicatoin {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println("Pole kwadratu= " + square.area());
        System.out.println("Obwód kwadratu= " + square.circuit());

        Shape triangle = new Triangle(4, 3, 5, 3);
        System.out.println("Pole trojkata= " + triangle.area());
        System.out.println("Obwod trojkata= " + triangle.circuit());

        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Pole prostokata= " + rectangle.area());
        System.out.println("Obwod prostokata= " + rectangle.circuit());

      /*  Duck duck = new Duck();
        duck.giveVoice();
        Animal dog = new Dog();
        AnimalProcessor processor = new AnimalProcessor();
        processor.process(duck);*/
    }
}