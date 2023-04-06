package com.epam.lecture.io;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeDemo {

    private static final int AMOUNT = 5;

    public static void main(String[] args) {
        try (PipedInputStream in = new PipedInputStream();
             PipedOutputStream out = new PipedOutputStream(in)) {

            System.out.println(in.available());

            for (int i = 0; i < AMOUNT; i++) {
               out.write(i);
            }

            System.out.println(in.available());

            for (int i = 0; i < AMOUNT; i++) {
                System.out.println(in.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}