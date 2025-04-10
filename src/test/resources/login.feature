Feature: Login

  @positive-test
  Scenario: Validate login page UI/UX
    Given user is on login page
    And Logo nexmedis is displayed
    And message two is displayed with "Healthcare Management Software"


  @positive-test
  Scenario: Login using valid email and password
    Given user is on login page
    And user input ID Organization with "official_nexmedis"
    And User click lanjut button
    And user input email "qa-rec@nexmedis.com"
    And user input password with "password1234"
    When user click login button
    Then user is on homepage


  @negative-test
  Scenario: Login with invalid ID Organization
    Given user is on login page
    And user input ID Organization with "PT. XYZ"
    And User click lanjut button
    Then Pop up message gagal


  @negative-test
  Scenario: Login with empty username and password
    Given user is on login page
    And user input ID Organization with "official_nexmedis"
    And User click lanjut button
    And user input email ""
    And user input password with ""
    When user click login button
    Then Pop up message gagal login


  @negative-test
  Scenario: Login with invalid email
    Given user is on login page
    And user input ID Organization with "official_nexmedis"
    And User click lanjut button
    And user input email "jonathan.f.ross99@gmail.com"
    And user input password with "password1234"
    When user click login button
    Then Pop up message gagal login

