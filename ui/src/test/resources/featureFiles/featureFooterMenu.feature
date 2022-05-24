Feature: Testing footer menu functionality

  @smoke-selenium @TC-1-selenium
  Scenario: Footer menu functionality check
    Given I am open main page for footer testing
      When I am click site map
      And I am click mega projects
      And I am switch window back
      Then I am check text on button on site Информация