
  Feature: Test selects Option 1 and Option 2 from the drop down menu

   Scenario: Verify Option 1 and Option 2 are selected

     Given user is on the dropdown page
     When user clicks on the dropdown option
     Then verify user select option one
     And verify user select option two