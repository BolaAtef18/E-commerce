@smoke
Feature: add different products to Wishlist
  Scenario: add different products to Wishlist
    Given user open browser and login
    When user add different products to Wishlist
    Then user can logout and success
