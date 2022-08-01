Feature: Test open chrome and search

  @smoke-selenide-mobile @TC-4-selenide-mobile
  Scenario: Open chrome and take search
    Given I am open main page in chrome
      When I am enter text in search field Apple
      And I am click on copy link button
      Then I am check copy link popUp