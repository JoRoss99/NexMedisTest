package com.joross.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetailProductPage {
    WebDriver driver;

    By productTitle = By.xpath("");

    private By addToCartButon(String idButton) {
        return By.xpath("//*[@id=\"" + idButton + "\"]");
    }

    public DetailProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnDetailProductPage(String productName) {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals(productName, productElement.getText());
    }
    public void clickAddToCartButton(String idButton) {
        driver.findElement(addToCartButon(idButton)).click();
    }
}
