Feature: Orange HRM - Login

  @hrmlogin
  Scenario: user login Orange HRM successfuly
    Given I open Orange HRM login page
    When I input username and password
    And I click login button
    Then I can login successfuly