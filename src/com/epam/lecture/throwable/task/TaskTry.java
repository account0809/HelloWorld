package com.epam.lecture.throwable.task;

public class TaskTry {

    private int id;
    private String taskName;

    public static void main(String[] args) {
        TaskTry taskTry = new TaskTry();

        try {
            System.out.println(taskTry.taskName.length());
            System.out.println(taskTry.divide(4, 0));
        } catch (ArithmeticException | NullPointerException e) {
            System.err.println("Exception happened" + e.getMessage());
        }

        System.out.println(taskTry.divide(4, 2));
        System.out.println(taskTry.divide(4, 2));
    }

    public int divide(int a, int b) {
        return a/b;
    }

}
