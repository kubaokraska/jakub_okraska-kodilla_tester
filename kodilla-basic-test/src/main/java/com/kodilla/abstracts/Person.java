package com.kodilla.abstracts;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person (String firstName,int age, Job job){
        this.firstName=firstName;
        this.age=age;
        this.job=job;
    }

    public void PrintResponsibilities(){
        System.out.println("Obowiazki "+ this.firstName+ " w pracy to: "+ job.getResponsibilities());
    }
    public void PrintSalary(){
        System.out.println("Wynagrodzenie " +this.firstName+ " wynosi: "+ job.getSalary());
    }
}
