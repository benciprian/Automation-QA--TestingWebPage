package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.pages.AddProductToCart_MagazinLaptopuri;

public class EndAddToCartUsersSteps extends ScenarioSteps {
    private AddProductToCart_MagazinLaptopuri addProductToCartMagazinLaptopuri;
    @Step
    public void navigateToHomePage() {
        addProductToCartMagazinLaptopuri.navigateToHomePage("https://www.magazinlaptopuri.ro/");
    }

    @Step
    public void clickSelectSpecificProductButton() {
        addProductToCartMagazinLaptopuri.selectSpecificProduct();
    }

    @Step
    public void clickAddToCartProductButton() {
        addProductToCartMagazinLaptopuri.clickAddToCartButtonForSpecificProduct();
    }







}
