@todo
Feature: Amazon Homepage
  As a user
  I WANT to navigate to the Amazon Website
  So THAT I can validate the subtotal of multiple items in the basket

  Background:
    Given that I am on the Amazon Homepage


  Scenario: The correct subtotal is displayed when ordering multiple items

    When I search for an item on Amazon
    And I am on the item page
    And I select the item
    And I click Add to Basket
    And I can see the item in the basket
    And I increase the quantity to 2
    Then I can see the correct subtotal