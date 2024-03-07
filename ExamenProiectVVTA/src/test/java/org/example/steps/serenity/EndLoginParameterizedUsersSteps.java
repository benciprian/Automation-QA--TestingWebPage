package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.pages.LoginParameterized;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EndLoginParameterizedUsersSteps extends ScenarioSteps {

    private LoginParameterized loginParameterized;

    @Step
    public void navigateToLoginPage() {
        loginParameterized.navigateToAutentificarePage("https://www.magazinlaptopuri.ro/autentificare?back=my-account");
    }

    @Step
    public void loginWithValidCredentials() throws IOException {
        String[] credentials = readCredentialsFromFile("src/test/resources/features/search/login_credentials"); // Calea către fișierul cu credențiale

        loginParameterized.login(credentials[0], credentials[1]);
    }

    @Step
    public void loginWithInvalidCredentials() throws IOException {
        String[] credentials = readCredentialsFromFile("src/test/resources/features/search/login_invalid_credentials"); // Calea către fișierul cu credențiale

        loginParameterized.login(credentials[0], credentials[1]);
    }

    private String[] readCredentialsFromFile(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        return new String[]{lines.get(0), lines.get(1)}; // presupunând că prima linie este emailul și a doua linie este parola
    }
}
