Feature: Test feedback page

  @regress @smoke-selenide @TC-2
  Scenario: Feedback page load and check button
    Given I am open feedback page
      When I am insert test data in the themes list Гениальная идея
      And I am enter test email
      And I am enter test text message
        | A store credit card usually is the next step |
        | Major credit card such as a Visa or MasterCard |
        | A credit card is an indispensable part of life in America |
      And I am check list of themes
      Then I am check submit button contains Отправить