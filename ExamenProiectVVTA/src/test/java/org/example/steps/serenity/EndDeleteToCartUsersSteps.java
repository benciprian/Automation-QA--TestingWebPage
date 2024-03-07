package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.pages.AddProductToCart_MagazinLaptopuri;
import org.example.pages.DeleteProductToCart_MagazinLaptopuri;

public class EndDeleteToCartUsersSteps extends ScenarioSteps {
    private DeleteProductToCart_MagazinLaptopuri deleteProductToCartMagazinLaptopuri;
    @Step
    public void navigateToCartPage() {
        deleteProductToCartMagazinLaptopuri.navigateToCartPage("https://www.magazinlaptopuri.ro/comanda");
    }

    @Step
    public void clickDeleteProductButton() {
        deleteProductToCartMagazinLaptopuri.clickDeleteProductFromCartButton();
    }
}
