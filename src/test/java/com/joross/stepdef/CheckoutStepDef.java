package com.joross.stepdef;

import com.joross.page.CartPage;
import com.joross.page.CheckoutPage;
import com.joross.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CheckoutStepDef {

    CartPage cartPage;
    CheckoutPage checkoutPage;
    HomePage homePage;
    WebDriver driver = LoginStepDef.driver;


    @And("user click add to cart button")
    public void userClickAddToCartButton() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.clickadtochartbutton();
    }


    @And("user click continue button")
    public void userClickContinueButton() throws InterruptedException {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickcontinue();
    }

    @And("user on checkout overview page")
    public void userOnCheckoutOverviewPage() throws InterruptedException {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.overviewpage();
    }

    @And("total price is correct")
    public void totalPriceIsCorrect()  {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.totalprice();
    }

    @Then("checkout complete")
    public void checkoutComplete() throws InterruptedException {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.complete();
    }


    @And("user click on finish button")
    public void userClickOnFinishButton() throws InterruptedException {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.finishbutton();
    }

    @And("user fill shipping information with string postal code")
    public void userFillShippingInformationWithStringPostalCode() {
    checkoutPage = new CheckoutPage(driver);
    checkoutPage.fillinfo2();
    }

    @And("the continue button cannot be click")
    public void theContinueButtonCannotBeClick() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickcontinue();
    }


    @And("user fill first name with {string}")
    public void userFillFirstNameWith(String firstname) throws InterruptedException {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.firstname(firstname);
    }

    @And("user fill last name with {string}")
    public void userFillLastNameWith(String lastname) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.lastname(lastname);
    }

    @And("user fill postal code with {string}")
    public void userFillPostalCodeWith(String postalcode) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.postalcode(postalcode);
    }
}


