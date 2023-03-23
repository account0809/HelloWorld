package com.epam.lecture.ooptask;

public class Animal {

    String name;
    int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sleep() {

    }

    protected void eat() {
        System.out.println("Animal is eating");
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    void makeSound() {
        System.out.println("Animal is making sound");
    }
}
