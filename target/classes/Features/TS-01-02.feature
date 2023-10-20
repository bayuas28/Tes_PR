Feature: Login Into Saucedemo With wrong Password
  Scenario Outline: I want to login into saucedemo.com with valid username but wrong password
    Given Open browser
    And Open website saucedemo
    And Insert Username with standard_user
    And Insert Password with no_secret_sauce
    And Click Login
    Then Not Logged in