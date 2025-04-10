Feature: Login

  @positive-test
  Scenario: Login using valid email and password
    Given user is on login page
    And user input ID Organization with "official_nexmedis"
    And User click lanjut button
    And user input username with "qa-rec@nexmedis.com"
    And user input password with "password1234"
    When user click login button
    Then user is on homepage