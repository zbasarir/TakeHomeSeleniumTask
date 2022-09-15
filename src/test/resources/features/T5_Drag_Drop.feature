
Feature: Test drags element A to element B
  Scenario: drag element A to element B
    Given user is on the drag and drop page
    When user drags element A and drop into element B
    Then verify the text on element A and B are switched.