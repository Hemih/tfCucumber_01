@BankCashFeature @Regression
Feature: Techfios bank and cash New Account Functionality

  @BankCashScenario1
  Scenario Outline: User should be able to login with valid credentials
    and open a new account

    Given User is on the techfios login page
    When User enters the "<username>" in "Username" feild
    When User enters the "<password>" in "Password" feild
    And User clicks on "login"
    Then User should land on Dashboard page

    Examples: 
      | username          | password |
      | demo@techfios.com | abc123   |
