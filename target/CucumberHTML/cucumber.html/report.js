$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechFiosLoginFromDB.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios Login Functionality Validation wiht driving the data form My SQL DB",
  "description": "",
  "id": "techfios-login-functionality-validation-wiht-driving-the-data-form-my-sql-db",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeatureFromDB"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-login-functionality-validation-wiht-driving-the-data-form-my-sql-db;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the \"username\" from techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the \"password\" from techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
});