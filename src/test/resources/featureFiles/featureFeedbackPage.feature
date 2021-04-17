Feature: Testing authorization functionality

  Scenario: Feed back page load and check button
    Given Open site
    When Click list options
    And Enter email
    And Enter massage
    Then Check submit button