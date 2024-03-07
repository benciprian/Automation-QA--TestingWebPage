package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.pages.NavigateToContactPage;

public class EndNavigateToContactPage extends ScenarioSteps {
    private NavigateToContactPage navigateToContactPage;
    @Step
    public void navigateToContactPage() {
        navigateToContactPage.navigateToContactPage("https://www.magazinlaptopuri.ro/");
    }

    @Step
    public void clickContactButton() {
        navigateToContactPage.clickContactButton();
    }
}
