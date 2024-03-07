package org.example.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Autentificare_MagazinLaptopuri extends PageObject {
    private By enterEmail = By.id("email");
    private By enterPassword = By.id("passwd");
    private By autentificareButton = By.name("SubmitLogin");

    public void navigateToAutentificarePage(String url) {
        getDriver().get(url);
    }



    public void login(String email, String password) {
        find(enterEmail).type(email);
        find(enterPassword).type(password);

        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", find(autentificareButton));


    }
}
