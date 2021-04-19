Feature: Testing authorization functionality

  #todo add check of options throw data table (https://www.baeldung.com/cucumber-data-tables)

  Scenario: Feedback page load and check button
    Given Open site
      When Click list options
      And Enter email
      And Enter massage
      Then Check submit button