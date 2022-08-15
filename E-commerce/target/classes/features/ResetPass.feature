Feature: user can reset password
  Scenario: user can reset password
    Given user open browser and navigates to login page and login
    When open personal info
    And enter old password and new password and press save
    And make sure the password change
    Then user could logout from the reset page
