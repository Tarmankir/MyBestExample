Feature: Testing language settings functionality

  @smoke-selenium @TC-2-selenium
  Scenario: English language configuration check
    Given I am open main page
      When I am click language settings
      And I am click english interface
      And I am click button save language settings
      Then I am check text on button login on site Log in