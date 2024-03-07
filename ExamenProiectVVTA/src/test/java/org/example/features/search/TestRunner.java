package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;

import org.example.steps.serenity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


@RunWith(SerenityRunner.class)
public class TestRunner {

    @Managed(uniqueSession = true, driver = "firefox")
    public WebDriver webdriver;


    @Steps
    public EndAutentificareUsersSteps endAutentificareUserSteps;

    @Steps
    public EndNavigateToContactPage endNavigateContactPageUserSteps;

    @Steps
    public EndAddToCartUsersSteps endAddToCartUsersSteps;

    @Steps
    public EndDeleteToCartUsersSteps endDeleteToCartUsersSteps;

    @Steps
    public EndSearchUsersSteps anna;

    @Steps
    public ResultSteps annaS;

    private void setBrowserWindowSize(int width, int height) {
        webdriver.manage().window().setSize(new Dimension(width, height));
    }

    @Test
    public void LoginToMagazinLaptopuriWebsiteValidCredentials() {
        setBrowserWindowSize(1920, 1080);
        endAutentificareUserSteps.navigateToLoginPage();
        endAutentificareUserSteps.loginWithValidCredentials();
        String expectedUrl = "https://www.magazinlaptopuri.ro/autentificare?back=my-account";
        assertEquals("Conectare reusita la contul de utilizator",expectedUrl, webdriver.getCurrentUrl());

        webdriver.manage().window().maximize();

    }

    @Test
    public void LoginToMagazinLaptopuriWebsiteInvalidCredentials() {
        setBrowserWindowSize(1920, 1080);
        endAutentificareUserSteps.navigateToLoginPage();
        endAutentificareUserSteps.loginWithInvalidCredentials();
        String expectedUrl = "https://www.magazinlaptopuri.ro/autentificare?back=my-account";
        assertEquals("Conectare nereusita la contul de utilizator",expectedUrl, webdriver.getCurrentUrl());

        webdriver.manage().window().maximize();

    }




    @Test
    public void AddToProductInCart() {
        setBrowserWindowSize(1920, 1080);
        endAddToCartUsersSteps.navigateToHomePage();
        endAddToCartUsersSteps.clickSelectSpecificProductButton();
        endAddToCartUsersSteps.clickAddToCartProductButton();
    }



    @Test
    public void DeleteProductFromCart() {
        setBrowserWindowSize(1920, 1080);
        endDeleteToCartUsersSteps.navigateToCartPage();
        endDeleteToCartUsersSteps.clickDeleteProductButton();


    }


    @Test
    public void NavigateContactPageMagazin_LaptopuriWebsite() {
        setBrowserWindowSize(1920, 1080);
        endNavigateContactPageUserSteps.navigateToContactPage();
        endNavigateContactPageUserSteps.clickContactButton();
        webdriver.manage().window().maximize();

        // Expected URL of the contact page
        String expectedUrl = "https://www.magazinlaptopuri.ro/contact"; // Replace with the actual expected URL
        String actualUrl = webdriver.getCurrentUrl();

        // Assertion with a message
        assertEquals("The URL does not match the expected contact page URL", expectedUrl, actualUrl);
    }


    @Test
    public void searching_by_keyword_should_display_the_corresponding_article() {
        setBrowserWindowSize(1920, 1080);
        anna.is_the_home_page();
        anna.looks_for("Baterie Laptop Panasonic ORIGINALA - CF-30 , CF-31, CF-53 - CF-VZSU46");

        // Expected text
        String expectedText = "Baterie Laptop Panasonic ORIGINALA - CF-30 , CF-31, CF-53 - CF-VZSU46";

        // Assuming annaS.should_see_definition returns the actual text from the web page
        String actualText = annaS.should_see_definition("Baterie Laptop Panasonic ORIGINALA - CF-30 , CF-31, CF-53 - CF-VZSU46");

        // Assertion to check if the expected text matches the actual text
        assertEquals("The product description does not match the expected text", expectedText, actualText);

        webdriver.manage().window().maximize();
    }


}







