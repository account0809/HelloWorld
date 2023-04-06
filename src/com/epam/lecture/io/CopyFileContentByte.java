package com.epam.lecture.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileContentByte {

    public static void main(String[] args){

        try (FileInputStream from = new FileInputStream(".\\src\\com\\epam\\lecture\\source.txt");
             FileOutputStream to = new FileOutputStream(".\\src\\com\\epam\\lecture\\copy.txt")) {

            int current;

            while (from.available() > 0) {
                current = from.read();
                to.write(current);

                System.out.printf("We get %d = %s. [%d] bytes are available to read.%n",
                        current, (char) current, from.available());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
