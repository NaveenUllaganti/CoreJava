package com.github.loginpagetest;

import com.github.base.BaseClass;
import com.github.loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

    @Test(priority = 1)
    public void testLogoIsDisplayed() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isLogoDisplayed(), "Logo should be displayed on the page");
    }

    @Test(priority = 2)
    public void testSignInFunctionality() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(configReader.getUsername());
        loginPage.enterPassword(configReader.getPassword());
        loginPage.clickSignInButton();

        // Verify the title after signing in
        String expectedTitle = "GitHub"; // Adjust this based on the actual expected title after login
        String actualTitle = loginPage.getPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title should be " + expectedTitle + " after signing in");
    }
}
