Feature: Testing main page search functionality

  @regress @smoke-selenide @TC-7
  Scenario: Main page search check
    Given I am open main page and click search
      When I am click on search button
      And I am enter test text and go to search Программирование
      Then I am check search text equals test text Программирование