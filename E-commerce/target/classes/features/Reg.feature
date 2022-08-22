@reg
Feature: user Registration successfully

  Scenario: user Registration successfully
    Given user open browser and navigates to registrate page
    When enter valid email and press on create account
    And enter valid data and press on Register
    Then user could logout from Registration page



