package com.epam.lecture.factory;

public class Firefox extends Browser {
    @Override
    public void configure() {
        System.out.println("Firefox is configured and ready to use");
    }
}
