package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.Pages.LogIn;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LogIn login = new LogIn();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on the ‘Sign In’ link
        login.clickOnSignIn();
        //Verify the text ‘Welcome Back!’
        String actualWelcomeText = login.verifyWelcomeText();
        String expectedWelcomeText = "Welcome Back!";
        Assert.assertEquals(actualWelcomeText,expectedWelcomeText);
    }

    @Test
    public void verifyTheErrorMessage() {
         //  click on the ‘Sign In’ link
        login.clickOnSignIn();
        // Enter invalid username
        login.enterInvalidUserName("xyz123@gmail.com");
       // Enter invalid password
        login.enterInvalidPassword("abc");
      // Click on Login button
        login.clickOnLogin();
      // Verify the error message ‘Invalid email or password.’
        String actualErrorText = login.verifyErrorText();
        String expectedErrorText = "Invalid email or password.";
        Assert.assertEquals(actualErrorText,expectedErrorText);
    }
}
