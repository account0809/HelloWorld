package com.epam.lecture.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();

        Method[] methods = baseTest.getClass().getDeclaredMethods();

        for (Method method : methods) {
            Test annotation = method.getAnnotation(Test.class);
            System.out.printf("%s [%d] %n", annotation.description(), annotation.ticketId());
            if (annotation.isSmoke()) {
                try {
                    method.invoke(baseTest);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
