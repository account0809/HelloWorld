package com.epam.lecture.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1 :
                    System.out.println("Hello!");
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(".\\src\\com\\epam\\lecture\\source.txt"))) {
                            writer.write("city");
                    } catch (IOException e) {
                        e.printStackTrace();
                    };
                    break;
                case 2 :
                    System.out.println("Bonjour!");
                    break;
                case 3 :
                    System.out.println("Bye!!!");
                    scanner.close();
                    return;
            }
        }
    }
}
