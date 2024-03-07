package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.pages.Autentificare_MagazinLaptopuri;

public class EndAutentificareUsersSteps extends ScenarioSteps {
    private Autentificare_MagazinLaptopuri magazinLaptopuri;
    @Step
    public void navigateToLoginPage() {
        magazinLaptopuri.navigateToAutentificarePage("https://www.magazinlaptopuri.ro/autentificare?back=my-account");
    }

    @Step
    public void loginWithValidCredentials() {
        magazinLaptopuri.login("ben27ciprian@gmail.com", "Retele2018");
    }

    @Step
    public void  loginWithInvalidCredentials() {
        magazinLaptopuri.login("ben27ciprian@gmail.com", "info2018");
    }

}
