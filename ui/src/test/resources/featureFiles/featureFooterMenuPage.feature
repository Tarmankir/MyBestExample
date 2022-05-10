Feature: Testing footer menu functionality

  @TC-76844
  Scenario: Footer menu functionality check
    Given I am open main page for footer testing
      When I am click site map
      And I am click mega projects
      And I am switch window back
      Then I am check text on button on site СТАТЬИ