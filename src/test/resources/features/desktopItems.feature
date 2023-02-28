Feature: Desktop Items
@desktopItems
Scenario: Validate Tablets tab on the UI

  Given I am on Test Environment Home Page
  When i hover my mouse over desktop dropdown
  Then i see show all desktops link
  And i click on show all desktops link
  And i validate the Tablets tab on the UI
