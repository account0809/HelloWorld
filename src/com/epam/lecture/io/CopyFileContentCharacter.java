package com.epam.lecture.io;

import java.io.*;

public class CopyFileContentCharacter {

    public static void main(String[] args){

        try (FileReader from = new FileReader(".\\src\\com\\epam\\lecture\\source.txt");
             FileWriter to = new FileWriter(".\\src\\com\\epam\\lecture\\copy.txt")) {

            char[] content = new char[6];

            System.out.printf("Something left to read - %b.%n", from.ready());

            while (from.ready()) {

                from.read(content);
                to.write(content);

                System.out.printf("We get content \"%s\" from file. Something left to read - %b.%n",
                        String.valueOf(content), from.ready());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
