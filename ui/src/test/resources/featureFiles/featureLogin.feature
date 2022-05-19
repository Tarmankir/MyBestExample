Feature: Testing login page functionality

  @smoke @TC-3
  Scenario: Login page authorization check
    Given I am open login page
      When I am use login page functionality to signup in site
      And I am click signup button
      Then I am check user login message Приветствуем вас, @Tarman332