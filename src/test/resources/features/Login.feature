Feature: login

  @login
  Scenario Outline: I want to login to the website
    Given I am on the login screen
    And I enter <username> in username textbox
    And I enter <password> in password textbox
    And I click on login button
#    Then I validate that i have logged in

    Examples:
      |username | password|
      |standard_user   |  secret_sauce  |