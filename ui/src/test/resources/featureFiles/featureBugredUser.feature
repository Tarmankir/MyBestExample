Feature: Testing bugred user creation

  @smoke-selenide @TC-4-selenide
  Scenario: Check bugred user creation
    Given I am open bugred page
      When I am use rest bugred user create
      And I am set email
      And I am refresh page
      Then I am check created user email