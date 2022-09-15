
Feature: Test right clicks on the context menu

  Scenario: Verify the alert menu text.
    Given user is on the context menu page
    When user right click on the box
    Then verify JavaScript alert text