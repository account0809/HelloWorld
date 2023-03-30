package com.epam.lecture.builder;

public class Program {

    public static void main(String[] args) {
        //User user = new User(1, "Ben", "Harrison", "151 King street", true);

        User user = new User().new UserBuilder(1, "Ben")
                .setLastName("Harrison")
                .setIsAdmin(true)
                .build();

        System.out.println(user);

    }
}
