Feature: Testing login page functionality

  Scenario: Login page authorization check
    Given I am open login page
      When I am use login page functionality to signup in site
      And I am click signup button
      And I am check user ID https://habr.com/ru/users/tarman332/
      Then I am close my browser