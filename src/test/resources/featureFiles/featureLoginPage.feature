Feature: Testing authorization functionality

  Scenario: Sign up in site
    Given Open site
    When Enter login ivakidov@mail.ru
    And Enter password School593
    Then Authorization on site