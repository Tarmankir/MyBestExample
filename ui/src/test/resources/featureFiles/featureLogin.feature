Feature: Testing login page functionality

  @regress @smoke-selenium @TC-5
  Scenario: Login page authorization check
    Given I am open login page
      When I am use login page functionality to signup in site
      And I am click signup button
      Then I am check user login message Приветствуем вас, @Tarman332