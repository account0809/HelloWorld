package com.epam.lecture.io;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayDemo {

    public static void main(String[] args) {
        String text = "Hello world!";

        try (CharArrayReader reader = new CharArrayReader(text.toCharArray())) {
            int i;

            while ((i = reader.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
