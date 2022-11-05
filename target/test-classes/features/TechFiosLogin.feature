@LoginFeature @Regression
Feature: TechFios Login Functionality Validation

@Scenario01 @Smoke
  Scenario Outline: User should be able to login with valid credentials
    Given User is on the techfios login page
    When User enters the username as "demo@techfios.com"
    When User enters the password as "abc123"
    And User clicks on login button
    Then User should land on Dashboard page

  @Scenario02 
  Scenario Outline: User should be able to login with valid credentials
    Given User is on the techfios login page
    When User enters the username as "<username>"
    When User enters the password as "<password>"
    And User clicks on login button
    Then User should not land on Dashboard page

    Examples: 
      | username            | password |
      | demo69@techfios.com | abc123   |
      | emo@techfios.com    | abc123   |
      | demo@techfios.com   | abc1234  |
      | demo21@techfios.com | ab123    |
      |                     |          |
