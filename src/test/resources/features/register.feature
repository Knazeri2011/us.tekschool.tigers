Feature: Register
@register
Scenario: Register with Test Environment Website
  Given I am on Test Environment Home Page
  When I click on My Account button
  Then i click on register link 
  And i fill registrsation form
  |firstname|lastname|email|telephone|password|confirmPassword|
  |tigers|tekschool|tigerstekschool00112@gmail.com|4024445566|tigers123|tigers123|
  And i subscribe to newssletter
  And i agree to privacy policy
  And i click on continue button
  Then i validate my account is created successfully