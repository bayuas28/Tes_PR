Feature: Login Into Saucedemo
  Scenario Outline: I want to login into saucedemo.com with valid account
    Given Open browser
    And Open website saucedemo
    And Insert Username with standard_user
    And Insert Password with secret_sauce
    And Click Login
    Then Logged in