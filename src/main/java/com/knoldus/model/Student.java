package com.knoldus.model;

public class Student {
    private String name;
    private int id;
    private int age;
    private Address address;

     public Student(String name, int id, int age, Address address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
