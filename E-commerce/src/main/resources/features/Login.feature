@smoke
Feature: user should be able to login to the system

  Scenario: user login with valid username and password
    Given user open browser and navigates to login page

    When user enter valid username and password
    And user click on login button

    Then user could logout