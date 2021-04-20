Feature: Test feedback page

  Scenario: Feedback page load and check button
    Given I open site
      When I click list options
      And I enter email
      And I enter massage
      Then I check submit button