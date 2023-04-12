package com.epam.lecture.generics;

public class GenericArray {

    public <T> T getFirst(T[] array) {
        return array[1];
    }

    public static void main(String[] args) {
        GenericArray genericArray = new GenericArray();

        Integer[] arrayIntegers = { 1, 33, 44};
        String[] arrayStrings = {"Mike", "Ben", "Jenifer"};
        Book<Integer>[] arrayBooks = new Book<Integer>[]{
                new Book<>(1, "Harry Potter"),
                new Book<>("ISBN13345", "The Lord of the rings")};

        System.out.println(genericArray.getFirst(arrayIntegers));
        System.out.println(genericArray.getFirst(arrayStrings));
        System.out.println(genericArray.getFirst(arrayBooks));

        for (Book book: arrayBooks) {
            System.out.println(book.getId());
        }
    }
}
