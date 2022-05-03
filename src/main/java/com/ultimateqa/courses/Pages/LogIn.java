package com.ultimateqa.courses.Pages;

import com.ultimateqa.courses.Utilities.Utility;
import org.openqa.selenium.By;

public class LogIn extends Utility {
    // click on the ‘Sign In’ link
 By SignIn = By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]");
 public void clickOnSignIn(){
     clickOnElement(SignIn);
 }
    //Verify the text ‘Welcome Back!’
   By WelcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
 public String verifyWelcomeText(){
     return getTextFromElement(WelcomeText);
 }
//==========================verifyTheErrorMessage Test ===========================

    // Enter invalid username
 By InvalidUserName = By.id("user[email]");
 public void enterInvalidUserName(String invalidUsername) {
      sendTextToElement(InvalidUserName,invalidUsername);
    }

    // Enter invalid password
By InvalidPassword = By.id("user[password]");
    public void enterInvalidPassword(String invalidPassword) {
        sendTextToElement(InvalidPassword,invalidPassword);
    }
    // Click on Login button
By LogIn = By.xpath("//input[@type='submit']");
    public void clickOnLogin(){
        clickOnElement(LogIn);
    }
    // Verify the error message ‘Invalid email or password.
By ErrorText = By.xpath("//li[contains(text(),'Invalid email or password.')]");
    public String verifyErrorText(){
        return getTextFromElement(ErrorText);
    }
}
