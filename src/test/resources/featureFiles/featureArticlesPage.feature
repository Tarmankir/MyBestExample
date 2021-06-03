Feature: Test articles

  Scenario: Select random articles and check the button
    Given I am open articles page
      When I am open random article
      Then I am check share button contains Комментировать