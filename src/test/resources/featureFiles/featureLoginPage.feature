Feature: Testing authorization functionality

  Scenario: Sign up in site
    Given Open site
    When Get credentials
    And Enter login
    And Enter pass
    Then Authorization on site