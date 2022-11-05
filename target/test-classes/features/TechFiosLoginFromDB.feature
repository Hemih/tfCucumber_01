@LoginFeatureFromDB @Regression
Feature: TechFios Login Functionality Validation wiht driving the data form My SQL DB

  Scenario: User should be able to login with valid credentials
    Given User is on the techfios login page
    When User enters the "username" from techfios database
    When User enters the "password" from techfios database
    And User clicks on login button
    Then User should land on Dashboard page
