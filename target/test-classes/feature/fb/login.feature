@allfb
Feature: FB - login
  As a user
  I want to perform login on facebook
  but I can't see my news feed due to FB restriction
  Scenario: User has failed to login FB
    Given Agung open facebook login page
    When Agung input email and password
    And Agung click button login
    Then Agung can't see my news feed
    But Agung see FB has disable my account