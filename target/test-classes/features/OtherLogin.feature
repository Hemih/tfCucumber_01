@OtherFeature01 @Regression 
Feature: TechFios Login Functionality Validation

  @OtherScenario01 
  Scenario: User should be able to login with valid credentials(Other)
    Given User is on the techfios login page
    When User enters the password as "abc123"
    When User enters the username as "demo@techfios.com"
    And User clicks on login button
    Then User should land on Dashboard page

  @OtherScenario02
  Scenario: User should be able to login with valid credentials(Other)
    Given User is on the techfios login page
    When User enters the password as "ab123"
    When User enters the username as "demo21@techfios.com"
    And User clicks on login button
    Then User should land on Dashboard page

  @OtherScenario03 @Smoke
  Scenario: User should be able to login with valid credentials(Other)
    Given User is on the techfios login page
    When User enters the password as "abc1234"
    When User enters the username as "969mo@techfios.com"
    And User clicks on login button
    Then User should land on Dashboard page
