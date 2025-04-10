package com.joross.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    By inputemail = By.xpath("//input[@id='id']");
    By lanjutbutton = By.xpath("//*[@id=\"app\"]/main/main/div[2]/div/form/button");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton =    By.xpath("//*[@id=\"app\"]/main/main/div[2]/div/form/button");
    By IDOrganization = By.xpath("//*[@id=\"id\"]");
    By title = By.xpath("//*[@id=\"app\"]/main/main/div[1]/header/div");

    public LoginPage(WebDriver driver) {this.driver = driver;}
    public void goToLoginPage() {
        driver.get("https://stg-app.nexmedis.com/");
    }
    public void clicklanjutbutton() {
        driver.findElement(lanjutbutton).click();
    }

    public void inputIDOrganization(String ID)  {
        driver.findElement(IDOrganization).sendKeys(ID);
    }


    public void inputUsername(String username) {
        driver.findElement(inputemail).sendKeys(username);
    }


    public void inputPassword(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void title (){
        driver.findElement(title).isDisplayed();
    }

    public void validateErrorAppear(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
