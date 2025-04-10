package com.joross.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    By inputemail = By.xpath("/html/body/div/main/main/div[2]/div/form/div[1]/input");
    By lanjutbutton = By.xpath("//*[@id=\"app\"]/main/main/div[2]/div/form/button");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton =    By.xpath("//*[@id=\"app\"]/main/main/div[2]/div/form/button");
    By IDOrganization = By.xpath("//*[@id=\"id\"]");
    By title = By.xpath("//*[@id=\"app\"]/main/main/div[1]/header/div");
    By PopUp = By.xpath("/html/body/div[2]/dialog/section/div/h2");
    By errorlogin = By.xpath("//*[@id=\"app\"]/main/div/div");
    By logo = By.xpath("//*[@id=\"app\"]/main/main/div[2]/div/form/img");
    By pesantwo = By.xpath("//*[@id=\"app\"]/main/main/div[2]/div/form/p");

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

    public void errorpopup () {driver.findElement(PopUp).isDisplayed(); }

    public void gagallogin () {driver.findElement(errorlogin).isDisplayed(); }



    public void messagetwo(String welcometwo) {
        WebElement sistemtwo = driver.findElement(pesantwo);
        Assert.assertEquals(welcometwo, sistemtwo.getText());
    }

    public void logoone() {
        driver.findElement(logo).isDisplayed();
    }
}
