Feature: Testing menu page functionality

  @regress @smoke-selenium @TC-6
  Scenario: Menu page check
    Given I am open main page for menu testing
      When I am click to menu Develop
      And I am click menu site Map
      Then I am check text on button on menu Информация