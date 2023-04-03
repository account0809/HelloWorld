package com.epam.lecture.throwable.task;

public class Program {

    public static void main(String[] args) {
        Program program = new Program();

        try {
            program.inputName("Xang");
        } catch (LastLetterException e) {
            e.printStackTrace();
        }
    }

    public void inputName(String lastName) throws LastLetterException {
        if (lastName.startsWith("X") || lastName.startsWith("Y") || lastName.startsWith("Z")) {
            throw new LastLetterException(String.format("Last name %s starts with incorrect letter", lastName));
        }
    }
}
