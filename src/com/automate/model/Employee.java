package com.automate.model;

public class Employee {
    private String name;
    private int salary;
    private int age;
    private int uniqueIdentifier;

    public Employee(String name, int salary, int age, int uniqueIdentifier) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.uniqueIdentifier = uniqueIdentifier;
    }
    public void displayInformation(){
        System.out.println(this.name + "," + this.age + "," +this.salary + "," + this.uniqueIdentifier);

    }
    public int getUniqueIdentifier(){
        return uniqueIdentifier;
    }
    public String toString(){
        return "name " + name + "  salary " + salary + "  age " + age;
    }
    public void update(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;

    }
}
