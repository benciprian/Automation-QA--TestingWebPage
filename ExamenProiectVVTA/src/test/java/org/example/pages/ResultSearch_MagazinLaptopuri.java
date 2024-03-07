package org.example.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class ResultSearch_MagazinLaptopuri extends PageObject {
    public List<String> getDefinitions() {
        return findAll(By.cssSelector("a.product_img_link img.replace-2x")).stream()
                .map(element -> element.getAttribute("alt"))
                .collect(Collectors.toList());
    }
}
