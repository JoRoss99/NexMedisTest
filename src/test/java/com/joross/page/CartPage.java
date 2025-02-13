package com.joross.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By UserClickAddToChart = By.xpath("//*[@id=\"add-to-cart\"]");
    By checkIfContain = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By checkoutbutton = By.xpath ("//*[@id=\"checkout\"]");
    By itemName = By.xpath("//div[@class=\"inventory_item_name\"]");


    public void clickadtochartbutton() {
        driver.findElement (UserClickAddToChart).click();
        }

    public void checkIfContainItem() {
        WebElement element = driver.findElement (checkIfContain);
        assertTrue(element.isDisplayed());
    }

    public void clickcheckout() {
        driver.findElement (checkoutbutton).click();
    }

    public void checkIfContainItems(List<String> itemsToCheck) {
        List<WebElement> itemElements = driver.findElements(itemName);
        for (WebElement itemName : itemElements) {
            assertTrue(itemsToCheck.contains(itemName.getText()));
        }
    }
}
