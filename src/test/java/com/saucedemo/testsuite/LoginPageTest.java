package com.saucedemo.testsuite;


import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginLink();
        String expectedMessage = "PRODUCTS";
        String actualMessage = productsPage.getProductsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Products Page not displayed");
    }
}