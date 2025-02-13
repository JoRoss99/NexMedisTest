package com.joross.stepdef;

import com.joross.page.CartPage;
import com.joross.page.DetailProductPage;
import com.joross.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CartStepDef  {

    HomePage homePage;
    CartPage cartPage;
    DetailProductPage detailProductPage;
    WebDriver driver = LoginStepDef.driver;


    @And("user go to cart page")
    public void userGoToCartPage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.goToCartPage();
    }

    @Then("cart should contain product {string}")
    public void cartShouldContainProduct(String item) throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.checkIfContainItem();
    }

    @And("user click on product with the name {string}")
    public void userClickOnProductWithTheName(String item) throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickProductName(item);
    }

    @When("user click checkout")
    public void userClickCheckout() {
        cartPage = new CartPage(driver);
        cartPage.clickcheckout();
    }
//1
    @When("user click add to cart button with following id:")
    public void userClickAddToCartButtonWithFollowingId(List<String> items) throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickAddToCartButton(items);
    }

    @Then("cart should contain the following items name:")
    public void cartShouldContainTheFollowingItemsName(List<String> items) throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.checkIfContainItems(items);
    }

    @And("user is on detail product page {string}")
    public void userIsOnDetailProductPage(String productName) throws InterruptedException {
        detailProductPage = new DetailProductPage(driver);
        detailProductPage.validateOnDetailProductPage(productName);
    }
//2
    @When("user click add to cart button with id {string}")
    public void userClickAddToCartButtonWithId(String idButton) throws InterruptedException {
        detailProductPage = new DetailProductPage(driver);
        detailProductPage.clickAddToCartButton(idButton);
    }

    @And("user click on product with {string}")
    public void userClickOnProductWith(String item) throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickProductName(item);
    }
}
