Feature: Testing menu page functionality

  @smoke-selenium @TC-4-selenium
  Scenario: Menu page check
    Given I am open main page for menu testing
      When I am click to menu Develop
      And I am click menu site Map
      Then I am check footer Copyright © 2006–2022,