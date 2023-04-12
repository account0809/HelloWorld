package com.epam.lecture.io;

import java.io.IOException;
import java.nio.file.*;

public class FilesDemo {

    public static void main(String[] args) {
        FilesDemo filesDemo = new FilesDemo();

        //filesDemo.pathView();
        //filesDemo.pathTypes();
//        filesDemo.read();
//        System.out.println(" ---- ");
//        filesDemo.write();
//        System.out.println(" ---- ");
//        filesDemo.read();
        //filesDemo.moveFile();
        filesDemo.deleteFiles();

    }

    public void pathView() {
        //Path paths = Paths.get("C:\\FILES\\LECT\\init\\init.txt");
        Path path = Path.of("C:\\FILES\\LECT\\init\\init.txt");

        // starts/endsWith
        System.out.println(path.endsWith("nit.txt"));
        System.out.println(path.startsWith("C:\\FILES"));
    }

    public void pathTypes() {
        Path path = Path.of(".\\src\\resources\\io.txt");
        System.out.println("Parent: " + path.getParent());
        System.out.println("File Name: " + path.getFileName());

        System.out.println(path.isAbsolute());
        System.out.println(path.normalize());
        System.out.println(path.toAbsolutePath());

        Path pathDeeper = Path.of(".\\src\\resources\\io\\hello.txt");

        System.out.println(pathDeeper.relativize(path));
    }

    public void read() {
        Path path = Path.of("C:\\FILES\\REPO\\HelloWorld\\src\\resources\\io.txt");
        try {
            Files.readAllLines(path).forEach(l -> System.out.println(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() {
        String text = "Konnichiwa";
        Path path = Path.of("C:\\FILES\\REPO\\HelloWorld\\src\\resources\\io.txt");

        try {
            Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void moveFile() {
        Path pathFrom = Path.of("C:\\FILES\\REPO\\HelloWorld\\src\\resources\\io\\hello.txt");
        Path pathTo = Path.of("C:\\FILES\\REPO\\HelloWorld\\src\\resources\\newio\\hello.txt");

        try {
            Files.move(pathFrom, pathTo, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteFiles() {
        Path path = Path.of("C:\\FILES\\REPO\\HelloWorld\\src\\resources\\io.txt");

         if (Files.exists(path)) {
             try {
                 Files.delete(path);
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
    }
}