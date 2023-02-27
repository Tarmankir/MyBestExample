Feature: Testing copyright years

  @smoke-selenide @TC-6-selenide
  Scenario: copyright years on site
    Given I am open footer site page
    Then I am check copyright years contains © 2006–2023,