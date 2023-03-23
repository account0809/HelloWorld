package com.epam.lecture.ooptask;

public class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    private void play() {

    }
}
