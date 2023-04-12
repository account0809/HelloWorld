package com.epam.lecture.annotations;

public class BaseTest {

    @Test(description = "Login to application", ticketId = 3452, isSmoke = true)
    public void verifyLogin() {
        System.out.println("verifyLogin() is called");
    }

    @Test(description = "Logout of application", ticketId = 3453)
    public void verifyLogout() {
        System.out.println("verifyLogout() is called");
    }
}
