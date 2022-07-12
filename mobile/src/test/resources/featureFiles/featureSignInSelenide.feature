Feature: Test sign in selenide screen

  @smoke-selenide-mobile @TC-1-selenide-mobile
  Scenario: Application screen open and basic function check
    Given I am open sign in screen
      When I am login in app
      And I am open app menu
      And I am check user login name
      Then I am click on device button back