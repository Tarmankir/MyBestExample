Feature: Testing login page functionality

  Scenario: Login page authorization check
    Given Open login page
      When Login in site
      And Click signup button
      Then Check user