Feature: Test feedback page

    #todo add check of options throw data table (https://www.baeldung.com/cucumber-data-tables)

  Scenario: Feedback page load and check button
    Given I open site
      When I click list options
      And I enter email
      And I enter massage
      Then I check submit button