Feature: Testing sandbox page frames and text

  @smoke-selenide @TC-5-selenide
  Scenario: sandbox page frames and text
    Given I am open sandbox page
      When I am check frame sandbox is displayed
      Then I am check frame sandbox header О ПЕСОЧНИЦЕ
      And I am check frame sandbox body