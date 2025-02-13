package com.joross.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;}

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    private By addToCartButton(String item) {
        return By.xpath("//button[@id=\"" + item + "\"]");
    }
    By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    private By productName(String item) {
        return By.xpath("//div[@class=\"inventory_item_name\" and text()=\"" + item + "\"]");
    }



    public void goToCartPage() {
        driver.findElement(cartButton).click();
    }

    public void clickProductName(String item) {
        driver.findElement(productName(item)).click();

    }


    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }
//1
    public void clickAddToCartButton(List<String> items) {
        for (String item : items) {
            driver.findElement(addToCartButton(item)).click();
        }
    }
}

