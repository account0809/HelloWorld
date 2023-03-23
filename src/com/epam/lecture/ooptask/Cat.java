package com.epam.lecture.ooptask;

public class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void sleep() {
        System.out.println("Sleep [Cat]");
    }

    void catchMice() {

    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void makeSound() {
        System.out.println("Meeeooow");
    }

    @Override
    public void move() {
        System.out.println("Cat run");
    }

    @Override
    public void play() {
        System.out.println("Catch mice");
    }

    @Override
    public void askToPlay() {
        System.out.println("Cat asks to play");
    }
}