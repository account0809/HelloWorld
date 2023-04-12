package com.epam.lecture.generics;

public class GenericsDemo {

    public static void main(String[] args) {
        Book<Integer> book1 = new Book(1, "Harry Potter");
        Book<String> book2 = new Book("ISBN13345", "The Lord of the rings");

        // 12345
        // ISBN13345

        Integer id1 = book1.getId();
        String id2 = book2.getId();
    }
}
