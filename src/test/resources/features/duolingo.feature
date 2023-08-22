Feature: duolingo application testing is required.
  Scenario: successful login with existing credentials
    Given the "user" wants to login to duolingo
    When enter your credentials
    Then you see your account screen