package com.epam.lecture.ooptask;

public class TaskOne {

    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();

        Cat cat = new Cat("Tom", 5);
        Animal dog = new Dog("Pike", 7);

        taskOne.action(cat);
        taskOne.action(dog);
    }

    private void action(Animal animal) {
        animal.move();
        animal.askToPlay();
        animal.play();
    }

    private void sleep(Cat animal) {
        animal.sleep();
    }
}
