package org.example.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavigateToContactPage extends PageObject {
    private By contactButton = By.xpath("//a[@title='Contacteaza-ne']");

    public void navigateToContactPage(String url) {
        getDriver().get(url);
    }

    public void clickContactButton() {
        find(contactButton).click();
    }
}
