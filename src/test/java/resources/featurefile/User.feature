Feature: User test
  As a user I want to verify User page

  Background:
    Given Login to Application
    And click On Admin Tab
    And Verify this "System Users" Text

    @smoke @regression
  Scenario: Admin should add user successfully
    When click On Add button
    Then Verify "Add User" Text
    When Select User Role Admin
    And enter Employee Name
    And Select status Disable
    And enter Username
    And enter password
    And enter Confirm Password
    And click On Save Button
    Then verify message "Successfully Saved"

    @sanity @regression
  Scenario: Admin can search and verify the user is created
      When Enter Username to search
      And Select User Role
      And Select Status
      And Click on Search Button
      Then Verify the User should be in Result list.

    @regression
  Scenario: Admin should delete User successfully
    When Enter Username to search
    And Select User Role
    And Select Status
    And Click on Search Button
    Then Verify the User should be in Result list.
    When Click on Check box
    And Click on Delete Button
    And Popup will display and Click on Ok Button on Popup
    Then verify delete message "Successfully Deleted"

      @regression
  Scenario: User can search deleted user and verify no record found message
    When Enter Username to search
    And Select User Role
    And Select Status
    And Click on Search Button
    Then verify no record message "No Records Found"
