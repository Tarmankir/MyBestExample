Feature: Testing search functionality

  Scenario: Main page search check
    Given I am open main page and search
    When I am click on search button
    And I am enter test text and go to search Программирование
    Then I am check search text equals test text Программирование