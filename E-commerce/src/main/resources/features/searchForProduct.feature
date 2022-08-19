Feature: user can search for product
  Scenario: user can search for product
    Given user open browser and navigates to login page and logiin
    When enter any data on search filed
    And press Search
    And make sure the search success
    Then user could logout from the search page
