Feature: Add to Cart Product
  Scenario Outline: I want add some products to cart
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
