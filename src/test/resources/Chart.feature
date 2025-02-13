
Feature: Chart

  @positive-test
  Scenario: Adding items to the cart from homepage
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    When user click add to cart button with following id:
      | add-to-cart-sauce-labs-backpack       |
      | add-to-cart-sauce-labs-bolt-t-shirt   |
      | add-to-cart-sauce-labs-fleece-jacket  |
    And user go to cart page
    Then cart should contain the following items name:
      | Sauce Labs Backpack       |
      | Sauce Labs Bolt T-Shirt   |
      | Sauce Labs Fleece Jacket  |



