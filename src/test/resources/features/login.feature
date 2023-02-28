Feature: Login to Test Environment Website

Background:
  Given I am on Test Environment Home Page
  When I click on My Account button
  And I click on Login link


@loginTest
Scenario: Login to Test Environment with One User
  And I enter my username and password
  And I click on login button
  Then I am logged into my Test Environment account
  
@loginMulti
 Scenario Outline: Login with multile users 
  And I enter my username '<username>' and password '<password>'
  And I click on login button
  Then I am logged into my Test Environment account
  Examples:
  |username|password|
  |tigers001@gmail.com|meira10|
  |tigers002@gmail.com|meira10|
  |tigers003@gmail.com|meira10|
  
#Feature: List of Scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples:Container for s table/we can pass our test data a form of tabel using vertical pipes as separators
#In table under Examples keyword, the first line is always the headers and then we can start adding our test 
#data from second line
#Background: List of steps run before each of the scenarios
#Steps that are repeaded for each scenario/scenario outline, we can add them under Background keyword and 
#then those steps will be executed before every scenario/scenario outline
  