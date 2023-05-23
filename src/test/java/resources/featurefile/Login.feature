Feature: Login test
  As a User I want to login Orange HRM website

  @smoke @regression
  Scenario: User should login successful
    Given I am on login page
    When Enter username
    And Enter password
    And Click on Login Button
    Then Verify "Dashboard" Message

  @sanity @regression
  Scenario: Verify logo is displayed on homepage
    When I am on login page
    Then Verify Logo is Displayed

  @regression
  Scenario: User should logout successfully
    Given I am on login page
    When Enter username
    And Enter password
    And Click on Login Button
    And Click on User Profile logo
    And Mouse hover on Logout and click
    And Verify the text "Login" is displayed