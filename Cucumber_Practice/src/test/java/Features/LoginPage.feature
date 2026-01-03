
Feature: Login to application

  Scenario: Logins in to the application
    When user launches url
    Then login page is displayed "Welcome to urBuddi"
    When user enters "twl4admin@gmail.com" and "twl4test"
    Then user in navigates to dashboard page