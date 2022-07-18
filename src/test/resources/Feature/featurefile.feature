Feature: Validating login functionality of facebook page

  Scenario Outline: Scenario to validate the login functionality with valid username and valid password
    Given User lanches facebook application
    When User enters valid "<username>"
    And User enters the valid "<password>"
    And User clicks login button
    Then User validates successfull login

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |
      | user5    | pass5    |
      