package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.Search_MagazinLaptopuri;

public class EndSearchUsersSteps {
    Search_MagazinLaptopuri searchMagazinLaptopuri;
    @Step
    public void is_the_home_page() {
        searchMagazinLaptopuri.open();
    }
    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    @Step
    public void enters(String keyword) {
        searchMagazinLaptopuri.search(keyword);
    }

    @Step
    public void starts_search() {
        // Această metodă pare să fie redundantă dacă 'search' declanșează deja căutarea.
        // Dacă este necesară, ar trebui modificată pentru a se potrivi cu fluxul dorit de test.
    }
}
