Feature: Checkout some products
  Scenario Outline: I want to checkout some products on saucedemo.com with valid account
    Given Open browser
    And Open website saucedemo
    And Insert Username with standard_user
    And Insert Password with secret_sauce
    And Click Login
    Then Logged in
    And Click add to cart Sauce Labs Backpack
    And Click add to cart Sauce Labs Bike Light
    And Click Shopping Cart Icon Button
    Then Go to Cart Page
    And Click Checkout
    Given Checkout Information Request
    And Fill Checkout First Name information
    And Fill Checkout Last Name information
    And Fill Checkout Zip Postal Code information
    Then Continue to Overview Checkout Page
    Then Finish Checkout
    Given Checkout Complete Page
