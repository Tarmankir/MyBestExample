Feature: Test feedback page

    #todo add check of options throw data table (https://www.baeldung.com/cucumber-data-tables)

  Scenario: Feedback page load and check button
    Given I am open feedback page
      When I am insert test data in list options
      And I am enter test email q123iiiddjjj@yand.ru
      And I am enter test text massage
      Then I am check submit button contains Отправить