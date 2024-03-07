package org.example.features.search;



import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;

import org.example.steps.serenity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;


import java.io.IOException;

import static org.junit.Assert.assertEquals;


@RunWith(SerenityRunner.class)
public class TestRunnerParameterizedLogin {

    @Managed(uniqueSession = true, driver = "firefox")
    public WebDriver webdriver;


    @Steps
    public EndLoginParameterizedUsersSteps endLoginParameterizedUsersSteps;


    private void setBrowserWindowSize(int width, int height) {
        webdriver.manage().window().setSize(new Dimension(width, height));
    }

    @Test
    public void LoginToMagazinLaptopuriWebsiteValidCredentials() throws IOException {
        setBrowserWindowSize(1920, 1080);
        endLoginParameterizedUsersSteps.navigateToLoginPage();
        endLoginParameterizedUsersSteps.loginWithValidCredentials();
        String expectedUrl = "https://www.magazinlaptopuri.ro/autentificare?back=my-account";
        assertEquals("Conectare reusita la contul de utilizator", expectedUrl, webdriver.getCurrentUrl());

        webdriver.manage().window().maximize();

    }

    @Test
    public void LoginToMagazinLaptopuriWebsiteInvalidCredentials() throws IOException {
        setBrowserWindowSize(1920, 1080);
        endLoginParameterizedUsersSteps.navigateToLoginPage();
        endLoginParameterizedUsersSteps.loginWithInvalidCredentials();
        String expectedUrl = "https://www.magazinlaptopuri.ro/autentificare?back=my-account";
        assertEquals("Conectare nereusita la contul de utilizator",expectedUrl, webdriver.getCurrentUrl());

        webdriver.manage().window().maximize();

    }
}