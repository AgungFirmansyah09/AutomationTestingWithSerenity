@allhrmcrud
Feature: Orange HRM - CRUD Employee Data

  Background:
    Given I open Orange HRM login page
    When I input username and password
    And I click login button
    And I access employee list

    @hrmcreate
    Scenario: User add Orange HRM employee Successfully
      When I add new employee with required field only
      Then I can see my personal Detail

    @hrmread
    Scenario: user read Orange HRM employee list Successfully
      Then I can new employee list result

    @hrmupdate
    Scenario: User update Orange HRM employee Successfully
      When I search for new employee
      And I update new employee's middle name
      Then I can see the Personal Detail has changed

    @hrmdelete
    Scenario: User delete Orange HRM employee successfully
      When I search for new employee
      And I delete new employee
      Then I can't see delete employee on list