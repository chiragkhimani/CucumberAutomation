Feature: This files contains test cases for login module
  
  Developer - Ankit
  Tester   - Chirag

  @WIP
  Scenario: Verify login unsuccessful with invalid credential
    Given User open website
    Then read data from data table
      | Alan Francis       | male   |
      | Brendon Philips    | male   |
      | Christine Lobowski | female |
    Then read data from data table using map
      | name               | gender |
      | Alan Francis       | male   |
      | Brendon Philips    | male   |
      | Christine Lobowski | female |
