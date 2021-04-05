Feature: Testing authorization functionality

  Scenario: Login in site
    Given Get site
    When Enter login
    And Enter password
    Then Authorization on site