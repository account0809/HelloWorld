package com.epam.lecture.factory;

public class BrowserFactory {

    public Browser create(String browserName) {
        switch (browserName) {
            case "chrome" : return new Chrome();
            case "firefox" : return new Firefox();
            default: {
                System.err.println("The browser is not supported");
                return null;
            }
        }
    }
}
