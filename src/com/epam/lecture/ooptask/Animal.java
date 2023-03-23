package com.epam.lecture.ooptask;

public abstract class Animal implements Movable, Playable {

    protected String name;
    protected int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void sleep();
    abstract void eat();
    abstract void makeSound();

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}
