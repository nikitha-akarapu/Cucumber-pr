@nikitha
Feature: Add Employee
  Scenario: Add employee into the application
    When user launches url
    Then login page is displayed "Welcome to urBuddi"
    When user enters "twl4admin@gmail.com" and "twl4test"
    Then user in navigates to dashboard page
    When user navigates to employee tab on dashboard
    Then user verifies employee tab
    When user clicks on add employee button
    Then user verify add employee section
    When user adds the employee
    Then user verify employee adds successfully