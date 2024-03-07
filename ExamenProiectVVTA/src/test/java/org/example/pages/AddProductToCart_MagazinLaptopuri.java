package org.example.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductToCart_MagazinLaptopuri extends PageObject {
    private By productLink = By.xpath("//a[contains(@class, 'product-name') and contains(text(), 'Lenovo T480 - i5-8350u- 8GB RAM - 256 GB SSD')]");


    private By addToCartButtonForSpecificProduct = By.xpath("//a[contains(@class, 'ajax_add_to_cart_button') and @data-id-product='143']");

    public void navigateToHomePage(String url) {
        getDriver().get(url);
    }

    public void selectSpecificProduct() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement productLinkElement;

        try {
            productLinkElement = wait.until(ExpectedConditions.elementToBeClickable(productLink));
            productLinkElement.click();
        } catch (Exception e) {
            // Handle the case where the element is not clickable
            System.out.println("Specific product link is not clickable: " + e.getMessage());
            // You can throw an exception or handle it as per your test requirements
        }
    }


    public void clickAddToCartButtonForSpecificProduct() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10); // adjust the wait time as needed
        WebElement addToCartButtonElement = null;

        try {
            // Wait for the button to be visible and clickable
            addToCartButtonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButtonForSpecificProduct));
        } catch (Exception e) {
            // If waiting fails, find the element without waiting
            addToCartButtonElement = getDriver().findElement(addToCartButtonForSpecificProduct);
        }

        if (addToCartButtonElement != null) {
            try {
                // Try clicking the button normally
                addToCartButtonElement.click();
            } catch (Exception e) {
                // If normal click fails, use JavaScript to click
                ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", addToCartButtonElement);
            }
        } else {
            // Handle the case where the button is not found
            System.out.println("Add to Cart button not found");
            // You can throw an exception or handle it as per your test requirements
        }
    }




}
