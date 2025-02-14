package com.joross.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutPage {
    WebDriver driver;

    By inputFirstName = By.xpath("//*[@id=\"first-name\"]");
    By inputLastName = By.xpath("//*[@id=\"last-name\"]");
    By inputPostalCode = By.xpath("//*[@id=\"postal-code\"]");
    By continueButton = By.xpath("//*[@id=\"continue\"]");
    By checkoutOverviewTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By totalPriceWithTax = By.xpath("//*[contains(@class, \"summary_total_label\")]");
    By finishButton = By.xpath("//*[@id=\"finish\"]");
    By checkoutCompleteTitle = By.xpath("//*[@class=\"title\"]");
    By subTotalPrice = By.xpath ("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]");
    By itemPrice = By.xpath("//*[@class=\"inventory_item_price\"]");
    By taxPrice = By.xpath("//*[@class=\"summary_tax_label\"]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void firstname(String firstname)  {
        driver.findElement(inputFirstName).sendKeys(firstname);
    }
    public void lastname(String lastname)  {
        driver.findElement(inputLastName).sendKeys(lastname);
    }
    public void postalcode(String postalcode)  {
        driver.findElement(inputPostalCode).sendKeys(postalcode);
    }

    public void clickcontinue() {
        driver.findElement(continueButton).click();
    }

    public void overviewpage() {
        WebElement element = driver.findElement(checkoutOverviewTitle);
        assertTrue(element.isDisplayed());
    }

    public void totalprice() {
        List<WebElement> price = driver.findElements(itemPrice);
        String priceText;
        float totalPrice = 0, subTotal, tax, priceWithTax;

        for (WebElement itemPrice : price) {
            priceText = itemPrice.getText().replace("$", "");
            totalPrice += Float.parseFloat(priceText);
        }

        WebElement subTotalText = driver.findElement(subTotalPrice);
        subTotal = Float.parseFloat(subTotalText.getText().replace("Item total: $", ""));

        assertEquals(totalPrice, subTotal);

        WebElement taxPriceText = driver.findElement(taxPrice);
        tax = Float.parseFloat(taxPriceText.getText().replace("Tax: $", ""));

        WebElement priceWithTaxText = driver.findElement(totalPriceWithTax);
        priceWithTax = Float.parseFloat(priceWithTaxText.getText().replace("Total: $", ""));

        assertEquals(totalPrice + tax, priceWithTax);

    }

    public void finishbutton() {
        WebElement finishBtn = driver.findElement(finishButton);
        finishBtn.click();
    }

    public void complete() {
        WebElement element = driver.findElement(checkoutCompleteTitle);
        assertTrue(element.isDisplayed());
    }
    public void fillinfo2()  {
        driver.findElement(inputFirstName).sendKeys("Jonathan");
        driver.findElement(inputLastName).sendKeys("Ross");
        driver.findElement(inputPostalCode).sendKeys("alpahebt");
    }


}