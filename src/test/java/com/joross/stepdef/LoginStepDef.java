package com.joross.stepdef;

import com.joross.page.HomePage;
import com.joross.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginStepDef {
    LoginPage loginPage;
    HomePage homePage;
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

    @And("user see error message {string}")
    public void userSeeErrorMessage(String errorMessage) {
        loginPage.validateErrorAppear(errorMessage);
    }



    @And("user input ID Organization with {string}")
    public void userInputIDOrganizationWith(String IDOrganization) {
        loginPage.inputIDOrganization(IDOrganization);
    }

    @And("User click lanjut button")
    public void userClickLanjutButton() {
        loginPage.clicklanjutbutton();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String email) throws InterruptedException {
        loginPage.inputUsername(email);
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        loginPage.title();
    }
}
