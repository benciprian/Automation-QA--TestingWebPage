package org.example.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.magazinlaptopuri.ro/")
public class Search_MagazinLaptopuri extends PageObject {
   /* public void navigateToSearchPage(String url) {
        getDriver().get(url);
    }*/
    public void search(String keyword) {
        $("#search_query_top").typeAndEnter(keyword);
    }
}
