Feature: Test sign in and screenshot

  @smoke-selenium-mobile @TC-2-selenium-mobile
  Scenario: Application screen open and take screenshot
    Given I am open sign in screen
      When I am login in app
      Then I am take screenshot