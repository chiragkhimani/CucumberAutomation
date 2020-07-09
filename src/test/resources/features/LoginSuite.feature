Feature: This files contains test cases for login module
  
  Developer - Ankit
  Tester   - Chirag

  Background: 
    Given User open website

  @smoke @complete
  Scenario: Verify login successful
    When Enter username "standard_user" and password "secret_sauce"
    Then Verif user is on homepage

  @regression @complete
  Scenario: Verify login Unsuccessful
    When Enter username "problem_user" and password "problem_user"
    Then Verif user is on homepage
