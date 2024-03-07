package org.example.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteProductToCart_MagazinLaptopuri extends PageObject {
    public void navigateToCartPage(String url) {
        getDriver().get(url);
    }

    public void clickDeleteProductFromCartButton() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement deleteProductFromCartButtonElement;

        // Use a different selector if the ID is dynamic
        By deleteButtonSelector = By.cssSelector(".cart_quantity_delete"); // Example CSS selector

        try {
            deleteProductFromCartButtonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButtonSelector));
            deleteProductFromCartButtonElement.click();
        } catch (Exception e) {
            System.out.println("Delete product from cart button not found: " + e.getMessage());
            // Additional logging or screenshot capture
        }
    }
}
