Feature: Add to Cart

  @AddtoCart
  Scenario Outline: I want to add an item to a cart
    Given I am on the login screen
    And I enter <username> in username text box
    And I enter <password> in password text box
    And I click on login button
    Then I validate that i have logged in
    And I click on add to cart
#    And I validate that cart details
    And I click on the shopping cart
#    And I validate the item is in the shopping cart
    And I click on checkout
    And I enter <firstname> in firstname text box
    And I enter <lastname> in lastname text box
    And I enter <zipcode> in zipcode text box
    And I click on continue
#    And I validate the order summary details
    And I click on finish
#    Then I validate order completion


    Examples:
      |username        |  password      | firstname | lastname | zipcode |
      |standard_user   |  secret_sauce  | Phindile  | Mazibuko | 1234    |