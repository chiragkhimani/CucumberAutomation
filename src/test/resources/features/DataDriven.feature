Feature: This files contains test cases for login module
  
  Developer - Ankit
  Tester   - Chirag

  Scenario Outline: Verify login unsuccessful with invalid credential
    Given User open website
    When Enter username "<username>" and password "<password>"
    Then Verif invalid login error message is displayed

    Examples: 
      | username     | password     |
      | problem_user | problem_user |
      | secret_sauce | secret_sauce |
      | secret_sauce | problem_user |
      | problem_user | problem_user |
      | secret_sauce | secret_sauce |
      | secret_sauce | problem_user |
      | problem_user | problem_user |
      | secret_sauce | secret_sauce |
      | secret_sauce | problem_user |
