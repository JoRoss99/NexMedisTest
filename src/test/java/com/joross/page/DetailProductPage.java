package com.joross.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetailProductPage {
    WebDriver driver;

    By productTitle = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    By productname = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By chart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By detailchart = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By choosen = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    private By addToCartButon(String idButton) {
        return By.xpath("//*[@id=\"" + idButton + "\"]");
    }

    public DetailProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCartButton(String idButton) {
        driver.findElement(addToCartButon(idButton)).click();
    }

    public void choseproduct() {
        driver.findElement(productname).click();
    }

    public void validatebackpack() {
        assertTrue(driver.findElement(productTitle).isDisplayed());
    }
    public void clickaddtocart() {
        driver.findElement(chart).click();
    }

    public void gotochartdetail() {
        assertTrue(driver.findElement(detailchart).isDisplayed());
    }

    public void choosenproduct() {
        assertTrue(driver.findElement(choosen).isDisplayed());
    }

}
