Feature: Test articles

  Scenario: Select random articles and check the button
    Given I am open articles page
      When I am open random article
      And I am valid comments counter
      Then I am check share button contains Поделиться