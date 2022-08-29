Feature: Test open chrome and check companies list

  @smoke-selenide-mobile @TC-6-selenide-mobile
  Scenario: Open chrome and check companies list
    Given I am open companies page in chrome
      Then I am check companies list contains Facebook