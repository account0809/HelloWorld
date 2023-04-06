package com.epam.lecture.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {

    public static void main(String[] args) {
        String[] text = {"Paris", "Montreal", "Porto", "New York"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(".\\src\\com\\epam\\lecture\\source.txt"))) {
            for (String city : text) {
                writer.write(city);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
