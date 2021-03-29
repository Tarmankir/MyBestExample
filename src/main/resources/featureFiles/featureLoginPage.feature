Feature: Testing authorization functionality

  Scenario: Login in site
    Given Entry data for authorization
    When Authorization on site
    Then Check authorization on site