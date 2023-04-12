package com.epam.lecture.generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTask {

    public static void main(String[] args) {
        List<Book<Integer>> books = new ArrayList<>();

        books.add(new Book<>(1, "Harry Potter"));
        books.add(new Book<>(2, "The chronicles of Narnija"));
        books.add(new Book<>("132556 KL", "451 Far"));
        books.add(new Book<>(4, "Harry Potter 2"));

        for (Book book : books) {
            System.out.println(book.getId());
            if (book.getName().startsWith("H")) {
                System.out.println(book);
            }
        }
    }
}
