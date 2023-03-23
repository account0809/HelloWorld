package com.epam.lecture.factory;

public class Chrome extends Browser {
    @Override
    public void configure() {
        System.out.println("Chrome is configured and ready to use");
    }
}
