package com.joross.stepdef;

import com.joross.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class LoginStepDef {
    LoginPage loginPage;
    static WebDriver driver;

    @Given("user is on login page")

    public void userIsOnLoginPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--no-sandbox",
                "--disable-dev-shm-usage",
                "--remote-allow-origins=*"
        );
        driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        loginPage.goToLoginPage();
    }


    @And("user input password with {string}")
    public void userInputPasswordWith(String password) throws InterruptedException {
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton()  throws InterruptedException{
        loginPage.clickLoginButton();
    }

    @And("user input ID Organization with {string}")
    public void userInputIDOrganizationWith(String IDOrganization) {
        loginPage.inputIDOrganization(IDOrganization);
    }

    @And("User click lanjut button")
    public void userClickLanjutButton() throws InterruptedException {
        loginPage.clicklanjutbutton();
        Thread.sleep(1000);
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        loginPage.title();
    }

    @And("user input email {string}")
    public void userInputEmail(String email) {
        loginPage.inputUsername(email);
    }

    @Then("Pop up message gagal")
    public void popUpMessage() {
        loginPage.errorpopup();
    }

    @Then("Pop up message gagal login")
    public void popUpMessageGagalLogin() {
        loginPage.gagallogin();
    }



    @And("message two is displayed with {string}")
    public void messageTwoIsDisplayedWith(String Welcometwo) {
        loginPage.messagetwo(Welcometwo);
    }

    @And("Logo nexmedis is displayed")
    public void logoNexmedisIsDisplayed() {
        loginPage.logoone();
    }
}
