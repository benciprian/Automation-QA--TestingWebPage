package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.ResultSearch_MagazinLaptopuri;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

public class ResultSteps {
    ResultSearch_MagazinLaptopuri resultSearchMagazinLaptopuri;

    @Step
    public String should_see_definition(String definition) {
        assertThat(resultSearchMagazinLaptopuri.getDefinitions(), hasItem(containsString(definition)));
        return definition;
    }
}
