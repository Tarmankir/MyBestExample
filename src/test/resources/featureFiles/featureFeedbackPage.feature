Feature: Test feedback page

  Scenario: Feedback page load and check button
    Given I am open feedback page
      When I am insert test data in list options
      And I am enter test email
      And I am enter test text massage
        | A store credit card usually is the next step |
        | Major credit card such as a Visa or MasterCard |
        | A credit card is an indispensable part of life in America |
      Then I am check submit button contains Отправить